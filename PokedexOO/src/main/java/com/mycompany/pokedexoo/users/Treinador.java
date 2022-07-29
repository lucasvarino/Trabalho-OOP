/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.mycompany.pokedexoo.pokemon.Pokemon;
import java.util.ArrayList;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Treinador extends Pessoa {
    private String regiao;
    private ArrayList<Pokemon> pokemons;
    
    public Treinador(String _nome, String regiao) {
        super(_nome);
        this.regiao = regiao.toLowerCase();
        this.pokemons = new ArrayList<>();
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
    
    public void imprimePokemons() {

        if(this.pokemons.isEmpty()) {
            System.out.println("Você ainda não registrou nenhum pokemon!");
        } else {
            for (Pokemon pokemon : pokemons) {
                System.out.println(pokemon.getId() + " " + pokemon.getNome());
            }
        }
    }

    public void addPokemon(String pokemonName) {
        //TODO: Adicionar Tratamento de Exceção aqui
        
        try {
            Pokemon pokemon = Pokemon.getPokemonByUrl(pokemonName);
            
            if(pokemon.getRegion() != this.regiao) {
                // Tratamento de Exceção aqui
                
                System.out.println("O pokemon não é da mesma região do treinador!");
                return;
            }
            
            this.pokemons.add(pokemon);
        } catch (Exception e) {
            System.out.println("Esse pokemon não existe!");
        }
    }

    public boolean verificarId(int id) {
        if(this.pokemons.isEmpty()) {
            return false;
        } else {
            for (Pokemon pokemon : pokemons) {
                if(pokemon.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public void deletarPokemon(int id) {

        if(this.pokemons.isEmpty()) {
            System.out.println("Você ainda não registrou nenhum pokemon!");
            return;
        } else {
            for (Pokemon pokemon : pokemons) {
                if(pokemon.getId() == id) {
                    pokemons.remove(pokemon);

                    System.out.println("Pokemon removido com sucesso!");
                    this.imprimePokemons();

                    return;
                }
            }
        }

        System.out.println("Não foi encontrado nenhum pokemon com esse id!");

    }

    public void editarPokemon(int id, Pokemon pokemonEditado) {

        
        if(this.pokemons.isEmpty()) {
            System.out.println("Você ainda não registrou nenhum pokemon!");
        } else {
            for (Pokemon pokemon : pokemons) {
                if(pokemon.getId() == id) {
                    pokemons.set(pokemons.indexOf(pokemon), pokemonEditado);

                    System.out.println("Pokemon editado com sucesso!");
                    this.imprimePokemons();

                    return;
                }
            }
        }

        System.out.println("Não foi encontrado nenhum pokemon com esse id!");
    }
    
    
}
