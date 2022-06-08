/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import java.util.ArrayList;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Treinador extends Pessoa {
    private Region regiao;
    private ArrayList<Pokemon> pokemons;
    private String nome;

    public Treinador(int _id, String _nome) {
        super(_id, _nome);
        this.regiao = new Region();
        this.pokemons = new ArrayList<>();
        this.nome = _nome;
    }
    
    public String getNome() {
        return nome;
    }


    public Region getRegiao() {
        return regiao;
    }

    public void setRegiao(Region regiao) {
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

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
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
                System.out.println("COMPARAÇÃO - ID DO USUARIO - " + id + " ID DO POKEMON - " + pokemon.getId() + " COMPARAÇÃO - "  + (pokemon.getId() == id));
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
