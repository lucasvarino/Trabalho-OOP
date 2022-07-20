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
import java.util.*;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Pokemon {
    @SerializedName("id")
    private int id;
    
    @SerializedName("name")
    private String name;
    
    @SerializedName("height")
    private String height;
    
    @SerializedName("weight")
    private String weight;
    
    @SerializedName("types")
    private ArrayList<PokemonTypeSlot> tipos;
    
    @SerializedName("sprites")
    private PokemonSprites sprites;
    
    private PokemonRegion region;

    public Pokemon(int id, String nome, String altura, String peso) {
        this.id = id;
        this.name = nome;
        this.height = altura;
        this.weight = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getAltura() {
        return height;
    }

    public void setAltura(String altura) {
        this.height = altura;
    }

    public String getPeso() {
        return weight;
    }

    public void setPeso(String peso) {
        this.weight = peso;
    }

    public ArrayList<PokemonTypeSlot> getTipo() {
        return tipos;
    }

    public void setTipo(ArrayList<PokemonTypeSlot> tipo) {
        this.tipos = tipo;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }
    
    public static Pokemon getPokemonByUrl(String pokemonName) {
        try {
            String url = "https://pokeapi.co/api/v2/pokemon/" + pokemonName;
            
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "Application/json");
            
            if(conn.getResponseCode() != 200) {
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
            
            Pokemon pokemon = gson.fromJson(new String(response.getBytes()), Pokemon.class);
            
            return pokemon;
            
        } catch(IOException ex) {
            System.out.println("Erro ao processar sua requisição, tente novamente");
            return null;
        }
    }
    
    public void imprimePokemon() {
        System.out.println("NOME - " + this.name);
        System.out.println("ALTURA - " + this.height);
        System.out.println("PESO - " + this.weight);
        
        for(PokemonTypeSlot tipo : this.tipos) 
        {
            System.out.println("TIPO - " + tipo.getType().getName());
        }
        
        System.out.println("SPRITE - " + this.sprites.getSprite());
        
    }
}
