/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasvarino
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
    
    public T fromJson(String json) {
        T objeto = gson.fromJson(json, this.typeGenericClass);
        return objeto;
    }
    
    public List<T> fromJsonToList(String json) {
        Type objectType = new TypeToken<ArrayList<T>>(){}.getType();
        List<T> objetos = this.gson.fromJson(json, objectType);
        return objetos;
    }
}
