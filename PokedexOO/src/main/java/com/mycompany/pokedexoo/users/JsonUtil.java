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
 *
 * @author lucasvarino
 * @param <T>
 */
public class JsonUtil<T> {
    private final Gson gson;
    private final Class<T> typeGenericClass;

    public JsonUtil(Class<T> typeParameterClass) {
        this.gson = new Gson();
        this.typeGenericClass = typeParameterClass;
    }
    
    public String toJson(T objeto)
    {
        return this.gson.toJson(objeto);
    }
    
    public String toJson(List<T> listObjects) {
        return this.gson.toJson(listObjects);
    }
    
    public T fromJson() throws FileNotFoundException {
        String json = this.fileToJsonString();
        T objeto = gson.fromJson(json, this.typeGenericClass);
        return objeto;
    }
    
    public List<T> fromJsonToList() throws FileNotFoundException {
        String json = this.fileToJsonString();
        
        Type objectType = new TypeToken<ArrayList<T>>(){}.getType();
        List<T> objetos = this.gson.fromJson(json, objectType);
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
