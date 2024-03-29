/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.pokemon;

import com.mycompany.pokedexoo.pokemon.region.PokemonRegion;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.mycompany.pokedexoo.users.Treinador;
import excecoes.ComboBoxException;
import excecoes.PokemonApiException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Pokemon {
    private static int totalPokemons; // Propriedade estática para sabermos o total de pokemons
    private int idSistema; // Id do sistema, usado para saber qual pokemon editar, excluir, etc
    
    private String apelido;
    
    @SerializedName("id")
    private int idPokedex; // Id da pokedex, por ex - ditto tem id 132
    
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
    
    private String region;
    private static Pokemon pokemonAtual;

    public Pokemon() {
        this.idSistema = totalPokemons;
        Pokemon.totalPokemons += 1;
    }
    
    
    public Pokemon(String apelido) throws IOException { // Construtor usado pelo Gson
        this.idSistema = totalPokemons;
        Pokemon.totalPokemons += 1;
        this.region = null;
        this.apelido = this.name; // Caso não tenha nenhum apelido, por padrão ele é o nome do pokemon
    }

    public Pokemon(String apelido, String height, String weight) { // Construtor usado na Edição
        this.idSistema = totalPokemons;
        Pokemon.totalPokemons += 1;
        this.apelido = apelido;
        this.setAltura(height);
        this.setPeso(weight);
    }

   
    public Pokemon(int idPokedex, String nome, String altura, String peso) throws IOException { // Construtor usado na criação
        this.idSistema = totalPokemons;
        Pokemon.totalPokemons += 1;
        this.idPokedex = idPokedex;
        this.name = nome;
        this.height = altura;
        this.weight = peso;
        
        this.region = PokemonRegion.getPokemonRegionName(nome); // Método para pegar a região via API
    }

    public int getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(int id) {
        this.idPokedex = id;
    }

    public int getId() {
        return this.idSistema;
    }

    public void setId(int idSistema) {
        this.idSistema = idSistema;
    }

    public static int getTotalPokemons() {
        return totalPokemons;
    }

    public static void setTotalPokemons(int totalPokemons) {
        Pokemon.totalPokemons = totalPokemons;
    }
    
    

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    

    public String getAltura() {
        return height;
    }

    public void setAltura(String altura) {
        this.height = altura;
    }
    
    public boolean editarAltura(String altura) {
        try {
            Float.parseFloat(altura);
        } catch(NumberFormatException ex) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Favor Inserir Valores Numéricos!", "Valor de Altura Inválido", ERROR_MESSAGE);
            return false;
        }
        
        this.height = altura;
        return true;
    }
    
    public boolean editarPeso(String peso) {
        try {
            Float.parseFloat(peso);
        } catch(NumberFormatException ex) {
            JPanel painel = new JPanel();
            JOptionPane.showInternalMessageDialog(painel, "Favor Inserir Valores Numéricos!", "Valor de Peso Inválido", ERROR_MESSAGE);
            return false;
        }
        
        this.weight = peso;
        return true;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public static Pokemon getPokemonAtual() {
        return pokemonAtual;
    }

    public static void setPokemonAtual(Pokemon pokemonAtual) throws ComboBoxException {
        if(Treinador.getTreinadorAtual().getPokemons().isEmpty())
        {
            throw new ComboBoxException();
        }
        
        Pokemon.pokemonAtual = pokemonAtual;
    }
    
    public static Pokemon getPokemonByUrl(String pokemonName) throws PokemonApiException { // Principal método da classe, busca um pokemon na API e retorna ele juntamente com sua região
        try {
            String url = "https://pokeapi.co/api/v2/pokemon/" + pokemonName.toLowerCase(); // Busca na API
            
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "Application/json");
            
            if(conn.getResponseCode() != 200) { // Verifica se o pokémon realmente existe
                throw new PokemonApiException();
            }
            
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            String response = "";
            String line;
            
            while ((line = br.readLine()) != null) {
                response += line;
            }
            
            conn.disconnect();
            
            Gson gson = new Gson();
            
            Pokemon pokemon = gson.fromJson(new String(response.getBytes()), Pokemon.class); // Faz o mapping para a classe
            
            pokemon.setRegion(PokemonRegion.getPokemonRegionName(pokemon.getNome())); // Faz o set da região dinamicamente via API
            
            return pokemon;
            
        } catch(IOException ex) {
            System.out.println("Erro ao processar sua requisição, tente novamente" + ex);
            return null;
        }
    }
}
