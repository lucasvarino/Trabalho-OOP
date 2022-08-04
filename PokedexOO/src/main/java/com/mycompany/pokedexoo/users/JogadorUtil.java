/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class JogadorUtil { // Classe usada para Interagir com o JSON
    private final Gson gson;

    public JogadorUtil() {
        this.gson = new Gson();
        
    }
    
    public String toJson(Jogador jogador)
    {
        return this.gson.toJson(jogador);
    }
    
    public String toJson(List<Jogador> listObjects) {
        return this.gson.toJson(listObjects);
    }
    
    public Jogador fromJson() throws FileNotFoundException {
        String json = this.fileToJsonString();
        Jogador jogador = gson.fromJson(json, Jogador.class);
        return jogador;
    }
    
    public List<Jogador> fromJsonToList() throws FileNotFoundException {
        String json = this.fileToJsonString();
        
        Type objectType = new TypeToken<ArrayList<Jogador>>(){}.getType();
        List<Jogador> objetos = this.gson.fromJson(json, objectType);
        return objetos;
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

