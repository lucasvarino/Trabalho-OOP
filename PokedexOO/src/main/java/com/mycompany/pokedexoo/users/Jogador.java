/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
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
    
    private static String nomeAtual = "";
    private static Jogador jogadorAtual;
    
    public Jogador(String _nome, String _senha) throws IOException {
        super(_nome, _senha);
        this.treinadores = new ArrayList<>();
        this.treinadores.add(new Treinador("Ash", "Kanto")); // Por padrão o Jogador começa com um treinador
        jogadores.add(this);
        this.salvarJogadorJson();
    }

    public static Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public static void setJogadorAtual(Jogador jogadorAtual) {
        Jogador.jogadorAtual = jogadorAtual;
    }

    public static void setJogadorAtualByName(String nome) {
        // System.out.println("Jogador atual ainda nao setado!");
        // System.out.println(nome);
        // System.out.println(jogadores);
        for (Jogador j : Jogador.jogadores) {
            // System.out.println("Jogador atual verificando...");
            if (j.getNome().equals(nome)) {
                setJogadorAtual(j);
                // System.out.println("Jogador atual setado!");
            }
        }
    }
    
    public static String getNomeAtual() {
        return nomeAtual;
    }

    public static void setNomeAtual(String nomeAtual) {
        Jogador.nomeAtual = nomeAtual;
        System.out.println("Nome atual setado!");
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
    
    public static String[] getAllNomes() throws FileNotFoundException {
        List<Jogador> jogadoresJson = (List<Jogador>) jsonUtil.fromJsonToList();
        String[] nomes = new String[jogadoresJson.size()];
        
        for (int i = 0; i < jogadoresJson.size(); i++) {
            Object getrow = jogadoresJson.get(i);
            LinkedTreeMap<Object,Object> t = (LinkedTreeMap) getrow;
            nomes[i] = t.get("nome").toString();
            // System.out.println(nomes[i]);
        
        }
        
        return nomes;
    }
    
    public String[] getAllNomesTreinadores() throws FileNotFoundException {
        String[] nomes = new String[this.getTreinadores().size()];
        int i = 0;
        for(Treinador t : this.getTreinadores()) {
            nomes[i] = t.getNome();
            i++;
        }
        
        return nomes;
    }
    
    @Override
    public boolean logar(String username, String senha) {
        for (Jogador jogador : jogadores) {
            if(jogador.getNome().equals(username))
            {
                if(jogador.getSenha().equals(senha))
                {
                    return true;
                }
                
                System.out.println("Senha Incorreta!");
                return false;
            }
        }
        
        System.out.println("Não foi encontrado usuário com esse nome!");
        return false;
    }
    
    public static boolean registrar(String username, String senha) throws IOException {
        for (Jogador jogador : jogadores) {
            if(username.equals(jogador.getNome()))
            {
                System.out.println("Não é possível criar um jogador! Nome já utilizado");
                return false;
            }
        }
        
        Jogador jogador = new Jogador(username, senha);
        return true;
    }
}
