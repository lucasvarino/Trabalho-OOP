/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.pokemon;

import com.mycompany.pokedexoo.pokemon.region.Region;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import excecoes.RegiaoException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Generation {

    private final String name;
    private final String url;

    @SerializedName("main_region")
    private final Region region;

    public Generation(String name, String url, Region region) {
        this.name = name;
        this.url = url;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Region getRegion() {
        return region;
    }
    
    //Método usado no mapping de Pokémon
    public String getRegionNameFromGeneration() throws IOException { // Pega o nome da região via API
        String url = "https://pokeapi.co/api/v2/generation/" + this.name; // Seta a URL

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "Application/json");

        if (conn.getResponseCode() != 200) { // Verifica se a requisição é valida (tratamento é feito antes de chegar aqui)
            System.out.println("Requisição inválida, tente novamente.Res = " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String response = "";
        String line;

        while ((line = br.readLine()) != null) {
            response += line;
        }

        conn.disconnect();

        Gson gson = new Gson();

        Generation regiao = gson.fromJson(new String(response.getBytes()), Generation.class); // Faz o mapping 
        

        return regiao.getRegion().getName(); // Retorna o nome
    }
    
    public static boolean verificarRegiao(String regiao) throws MalformedURLException, IOException, RegiaoException { // Método usado para tratar as regiões que não existem
        String url = " https://pokeapi.co/api/v2/region/" + regiao.toLowerCase();

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "Application/json");

        if (conn.getResponseCode() != 200) { // Se não achar a região, lançar a exceção
            throw new RegiaoException();
        }
        
        return true;
    }
}
