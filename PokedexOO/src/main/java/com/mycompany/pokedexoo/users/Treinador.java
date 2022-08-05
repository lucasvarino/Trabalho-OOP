/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.mycompany.pokedexoo.pokemon.Generation;
import com.mycompany.pokedexoo.pokemon.Pokemon;
import excecoes.ComboBoxException;
import excecoes.InputException;
import excecoes.NameException;
import excecoes.PokemonApiException;
import excecoes.RegiaoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Treinador extends Pessoa {
    private int jogadorId; // Id do jogador
    private String regiao; // Região (já tratada com possíveis exceções)
    private List<Pokemon> pokemons; // Lista de pokemons do treinador
    public static final PokemonUtil jsonUtil = new PokemonUtil(); // Para interagir com o JSON

    private static Treinador treinadorAtual; // Treinador atual para usar nas interfaces após o login
    
    public Treinador(String _nome, String regiao) throws FileNotFoundException {
        super(_nome);
        this.regiao = regiao.toLowerCase(); // Colocando em minúsculo para evitar erros
        this.pokemons = new ArrayList<>();
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
    
    public static void setTreinadorAtualByName(String nome) throws ComboBoxException { // Método para setar o treinador após login
        if(Jogador.getJogadorAtual().getTreinadores().isEmpty())
        {
            throw new ComboBoxException();
        }
        
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

    public void addPokemon(String pokemonName, String apelido) throws InputException, PokemonApiException, RegiaoException { // Método para adicionar pokémon no array de pokemons
        if(pokemonName.isBlank() || apelido.isBlank())
        {
            throw new InputException();
        }
        
        try {
            Pokemon pokemon = Pokemon.getPokemonByUrl(pokemonName);
            pokemon.setApelido(apelido);
                 
            if(!pokemon.getRegion().equals(this.regiao)) { // Verifica se as regiões são iguais
                
                throw new RegiaoException();
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
    
    public void deletarPokemonAtual(Pokemon pokemon) throws IOException {
        pokemons.remove(pokemon);
        Jogador.salvarJogadorJson();
    }

    public void editarPokemon(Pokemon pokemonEditado) throws IOException { // Editar o pokemon

        
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
    
    public String[] getAllNomes() { // Método para exibir todos os nomes na ComboBox
        String[] nomes = new String[this.pokemons.size()];
        
        for (int i = 0; i < this.pokemons.size(); i++) {
            nomes[i] = this.pokemons.get(i).getApelido();
        }
        
        return nomes;
    }
    
    public Pokemon getPokemonByName(String name) { // Pegar o pokemon pelo nome
        for (Pokemon pokemon : pokemons) {
            if(pokemon.getApelido().equals(name))
                return pokemon;
        }
        
        return null;
    }
    
    
    public static boolean registrar(String username, String region) throws IOException, InputException, NameException, MalformedURLException, RegiaoException { // Registrar o pokemon
        if(username.isBlank() || region.isBlank())
        {
            throw new InputException();
        }
        
        for (Treinador treinador : Jogador.getJogadorAtual().getTreinadores()) {
            if(username.equals(treinador.getNome()))
            {
                throw new NameException();
            }
        }
        
        try {
            boolean regiaoValida = Generation.verificarRegiao(region);
            
            if(regiaoValida) {
                Treinador treinador = new Treinador(username, region);
                Jogador.getJogadorAtual().getTreinadores().add(treinador);
                Jogador.salvarJogadorJson();
                return true;
            }
        }catch(RegiaoException ex) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Região Inválida!", "Valores em Branco", ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    
}
