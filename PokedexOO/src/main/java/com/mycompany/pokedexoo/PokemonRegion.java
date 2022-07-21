/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */

public class PokemonRegion {

    private String name;
    
    @SerializedName("generation")
    private Generation geracao;
    
    public PokemonRegion(String name, Generation geracao) throws IOException {
        this.name = name;
        this.geracao = geracao;
    }

    public String getName() {
        return name;
    }

    public Generation getGeracao() {
        return geracao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int takeRegionIdFromUrl(String url) {
        int id = Integer.parseInt(Character.toString(url.charAt(-2)));

        return id;

    }
    
    public static PokemonRegion getRegionFromAPI(String pokemonName) throws IOException {
        String url = "https://pokeapi.co/api/v2/pokemon-species/" + pokemonName;
        System.out.println("URL - " + url);
        
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "Application/json");

        if (conn.getResponseCode() != 200) {
            System.out.println("Requisição inválida, tente novamente. RES = " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String response = "";
        String line;

        while ((line = br.readLine()) != null) {
            response += line;
        }

        conn.disconnect();

        Gson gson = new Gson();

        PokemonRegion region = gson.fromJson(new String(response.getBytes()), PokemonRegion.class);

        return region;
    }
    
    public static String getPokemonRegionName(String pokemonName) throws IOException
    {
        return PokemonRegion.getRegionFromAPI(pokemonName).getGeracao().getRegionNameFromGeneration();
    }
    

}
