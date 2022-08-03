/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.mycompany.pokedexoo.pokemon.Pokemon;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Treinador extends Pessoa {
    private int jogadorId;
    private String regiao;
    private List<Pokemon> pokemons;
    public static final PokemonUtil jsonUtil = new PokemonUtil();

    private static Treinador treinadorAtual;
    
    public Treinador(String _nome, String regiao) throws FileNotFoundException {
        super(_nome);
        this.regiao = regiao.toLowerCase();
        this.pokemons = new ArrayList<>();
        this.pokemons = jsonUtil.fromJsonToList(jogadorId, this.id);
    }

    public void setJogadorId(int jogadorId) {
        this.jogadorId = jogadorId;
    }

    public int getJogadorId() {
        return jogadorId;
    }

    public static Treinador getTreinadorAtual() {
        return treinadorAtual;
    }

    public static void setTreinadorAtual(Treinador treinadorAtual) {
        Treinador.treinadorAtual = treinadorAtual;
    }
    
    public static void setTreinadorAtualByName(String nome) {
        for (Treinador t : Jogador.getJogadorAtual().getTreinadores()) {
            if (t.getNome().equals(nome)) {
                setTreinadorAtual(t);
            }
        }
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public List<Pokemon> getPokemons() {
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

    public void addPokemon(String pokemonName, String apelido) {
        //TODO: Adicionar Tratamento de Exceção aqui
        
        try {
            Pokemon pokemon = Pokemon.getPokemonByUrl(pokemonName);
            pokemon.setApelido(apelido);
                 
            if(!pokemon.getRegion().equals(this.regiao)) {
                // Tratamento de Exceção aqui
                
                System.out.println("O pokemon não é da mesma região do treinador!");
                return;
            }
            
            this.pokemons.add(pokemon);
             Jogador.salvarJogadorJson();
        } catch (IOException e) {
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

    public void deletarPokemon(int id) throws IOException {

        if(this.pokemons.isEmpty()) {
            System.out.println("Você ainda não registrou nenhum pokemon!");
            return;
        } else {
            for (Pokemon pokemon : pokemons) {
                if(pokemon.getId() == id) {
                    pokemons.remove(pokemon);

                    System.out.println("Pokemon removido com sucesso!");
                    Jogador.salvarJogadorJson();

                    return;
                }
            }
        }

        System.out.println("Não foi encontrado nenhum pokemon com esse id!");

    }

    public void editarPokemon(Pokemon pokemonEditado) throws IOException {

        
        if(this.pokemons.isEmpty()) {
            System.out.println("Você ainda não registrou nenhum pokemon!");
        } else {
            for (Pokemon pokemon : pokemons) {
                if(pokemon.getId() == pokemonEditado.getId()) {
                    pokemons.set(pokemons.indexOf(pokemon), pokemonEditado);

                    System.out.println("Pokemon editado com sucesso!");
                    this.imprimePokemons();
                    Jogador.salvarJogadorJson();

                    return;
                }
            }
        }

        System.out.println("Não foi encontrado nenhum pokemon com esse id!");
    }
    
    public String[] getAllNomes() {
        String[] nomes = new String[this.pokemons.size()];
        
        for (int i = 0; i < this.pokemons.size(); i++) {
            nomes[i] = this.pokemons.get(i).getApelido();
        }
        
        return nomes;
    }
    
    public Pokemon getPokemonByName(String name) {
        for (Pokemon pokemon : pokemons) {
            if(pokemon.getApelido().equals(name))
                return pokemon;
        }
        
        return null;
    }
    
    
}
