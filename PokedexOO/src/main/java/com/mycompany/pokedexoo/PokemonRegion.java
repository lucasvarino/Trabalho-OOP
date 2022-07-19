/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import com.google.gson.Gson;
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

    private final int regionId;
    private String name;
    private String url;

    public PokemonRegion(String name, String url, String pokemonName) throws IOException {
        this.name = name;
        this.url = url;
       
        this.regionId = getRegionFromAPI(pokemonName);
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int takeRegionIdFromUrl() {
        int id = Integer.parseInt(Character.toString(this.url.charAt(-2)));

        return id;

    }

    public static int getRegionFromAPI(String pokemonName) throws IOException {
        String url = "https://pokeapi.co/api/v2/pokemon-species/" + pokemonName;

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "Application/json");

        if (conn.getResponseCode() != 200) {
            System.out.println("Requisição inválida, tente novamente.");
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

        return region.takeRegionIdFromUrl();
    }
    

}
