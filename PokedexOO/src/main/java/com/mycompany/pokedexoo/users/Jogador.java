/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.mycompany.pokedexoo.users.Usuario;
import com.mycompany.pokedexoo.users.Treinador;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Jogador extends Usuario {
    private static ArrayList<Jogador> jogadores = new ArrayList<>();
    private ArrayList<Treinador> treinadores;
    public static final JsonUtil<Jogador> jsonUtil = new JsonUtil<>(Jogador.class);
    
    public Jogador(String _nome, String _senha) throws IOException {
        super(_nome, _senha);
        this.treinadores = new ArrayList<>();
        this.treinadores.add(new Treinador("Ash", "Kanto")); // Por padrão o Jogador começa com um treinador
        jogadores.add(this);
        this.salvarJogadorJson();
    }
    
    public ArrayList<Treinador> getTreinadores() {
        return treinadores;
    }

    public void setTreinador(Treinador treinador) throws IOException {
        this.treinadores.add(treinador);
        this.salvarJogadorJson();
    }
    
    public Treinador getTreinadorById(int id) {
        for (Treinador treinador : treinadores) {
            if(treinador.getId() == id)
                return treinador;
        }
        
        return null;
    }

    public void imprimeNomesTreinadores() {
        for (Treinador treinador : treinadores) {
            System.out.println(treinador.getNome());
        }
    }
    
    private void salvarJogadorJson() throws IOException {
        Gson gson = new Gson();
        FileWriter writter = new FileWriter("users.json");
        gson.toJson(Jogador.jogadores, writter);
        writter.close();
    }
}
