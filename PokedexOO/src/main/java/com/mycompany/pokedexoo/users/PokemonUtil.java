/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.pokedexoo.pokemon.Pokemon;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucasvarino
 */
public class PokemonUtil {
    private final Gson gson;

    public PokemonUtil() {
        this.gson = new Gson();
        
    }
    
    public String toJson(Pokemon pokemon)
    {
        return this.gson.toJson(pokemon);
    }
    
    public String toJson(List<Pokemon> listPokemons) {
        return this.gson.toJson(listPokemons);
    }
    
    public Pokemon fromJson() throws FileNotFoundException {
        String json = this.fileToJsonString();
        Pokemon pokemon = gson.fromJson(json, Pokemon.class);
        return pokemon;
    }
    
    public List<Pokemon> fromJsonToList(int idJogador, int idTreinador) throws FileNotFoundException {
        String json = this.fileToJsonString();
        
        Type objectType = new TypeToken<ArrayList<Jogador>>(){}.getType();
        List<Jogador> objetos = this.gson.fromJson(json, objectType);
        
        List<Pokemon> pokemons = new ArrayList<>();
        
        for (Jogador jogador : objetos) {
            if(jogador.getId() == idJogador)
            {
                pokemons = jogador.getTreinadorById(idTreinador).getPokemons();
            }
        }
        
        return pokemons;
    }
    
    public String fileToJsonString() throws FileNotFoundException {
        StringBuilder conteudo = new StringBuilder();

        File arquivo = new File("users.json");

        Scanner leitor = new Scanner(arquivo);

        // varrendo o conteúdo do arquivo linha por linha
        while (leitor.hasNextLine()) {
            conteudo.append(leitor.nextLine()).append("\n");
        }
        
        return conteudo.toString();
    }
}

