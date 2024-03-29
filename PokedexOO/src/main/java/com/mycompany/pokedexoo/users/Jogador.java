/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.mycompany.pokedexoo.users.Usuario;
import com.mycompany.pokedexoo.users.Treinador;
import excecoes.InputException;
import excecoes.LoginException;
import excecoes.NameException;
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
    private static List<Jogador> jogadores = new ArrayList<>(); // Array de Jogadores que estão no JSON
    private final ArrayList<Treinador> treinadores; // Array de Treinadores do Jogador em específico
    public static final JogadorUtil jsonUtil = new JogadorUtil(); // Classe para interagir com o JSON
    
    private static String nomeAtual = "";
    private static Jogador jogadorAtual; // Usado para saber o jogador selecionado na interface
    
    public Jogador(String _nome, String _senha) throws IOException {
        super(_nome, _senha);
        this.treinadores = new ArrayList<>();
        jogadores = jsonUtil.fromJsonToList(); // Atualizando o array para o que tem no JSON
        this.treinadores.add(new Treinador("Ash", "Kanto")); // Por padrão o Jogador começa com um treinador
        jogadores.add(this);
        Jogador.salvarJogadorJson(); // Salvar o jogador no json
        
        for (Treinador treinador : treinadores) {
            treinador.setJogadorId(this.id);
        }
    }

    public void deletaTreinador(String nome) throws IOException { // Deletar treinador
        Treinador deletar = null;
        for (Treinador t : treinadores) {
            if (t.getNome().equals(nome)) {
                deletar = t;
            }
        }
        getTreinadores().remove(deletar);
        Jogador.salvarJogadorJson(); // Salvar o jogador atualizado
    }
    
    public void deletaJogador(String nome) throws IOException { // Deletar o Jogador
        Jogador deletar = null;
        for (Jogador j : jogadores) {
            if (j.getNome().equals(nome)) {
                deletar = j;
            }
        }
        jogadores.remove(deletar);
        Jogador.salvarJogadorJson();
    }
    
    public static Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public static void setJogadorAtual(Jogador jogadorAtual) {
        Jogador.jogadorAtual = jogadorAtual;
    }

    public static void setJogadorAtualByName(String nome) {
        for (Jogador j : Jogador.jogadores) {
            if (j.getNome().equals(nome)) {
                setJogadorAtual(j);
            }
        }
    }
    
    public static String getNomeAtual() {
        return nomeAtual;
    }

    public static void setNomeAtual(String nomeAtual) {
        Jogador.nomeAtual = nomeAtual;
    }
    
    public ArrayList<Treinador> getTreinadores() {
        return treinadores;
    }

    public void adicionarTreinador(Treinador treinador) throws IOException {
        this.treinadores.add(treinador);
        Jogador.salvarJogadorJson();
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
    
    public static void salvarJogadorJson() throws IOException { // Salvar jogador no JSON
        Gson gson = new Gson();
        FileWriter writter = new FileWriter("users.json");
        gson.toJson(Jogador.jogadores, writter);
        writter.close();
    }
    
    public static String[] getAllNomes() throws FileNotFoundException { // Função utilizada na interface visual para colocar os nomes na ComboBox
        List<Jogador> jogadoresJson = (List<Jogador>) jsonUtil.fromJsonToList();
        String[] nomes = new String[jogadoresJson.size()];
        
        for (int i = 0; i < jogadoresJson.size(); i++) {
            nomes[i] = jogadoresJson.get(i).getNome();
        }
        
        return nomes;
    }
    
    public String[] getAllNomesTreinadores() throws FileNotFoundException {
        String[] nomes = new String[jogadorAtual.getTreinadores().size()];
        int i = 0;
        for(Treinador t : jogadorAtual.getTreinadores()) {
            nomes[i] = t.getNome();
            i++;
        }
        
        return nomes;
    }
    
    @Override
    public boolean logar(String username, String senha) throws LoginException { // Polimorfismo para a função de login
        for (Jogador jogador : jogadores) {
            if(jogador.getNome().equals(username))
            {
                if(jogador.getSenha().equals(senha))
                {
                    return true;
                }
                
                throw new LoginException();
            }
        }
        
        throw new LoginException();
    }
    
    public static boolean registrar(String username, String senha) throws IOException, InputException, NameException {
        if(username.isBlank() || senha.isBlank())
        {
            throw new InputException(); //Caso o input esteja em branco
        }
        
        for (Jogador jogador : jogadores) {
            if(username.equals(jogador.getNome()))
            {
                throw new NameException(); // Caso já exista o nome cadastrado no banco
            }
        }
        
        Jogador jogador = new Jogador(username, senha);
        return true;
    }
    
    public static void atualizaJogadores() throws FileNotFoundException {
        jogadores = jsonUtil.fromJsonToList();
    }
}
