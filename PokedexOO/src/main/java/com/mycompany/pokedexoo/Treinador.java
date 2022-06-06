/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import java.util.ArrayList;

/**
 *
 * @author jpbba
 */
public class Treinador extends Pessoa {
    private Region regiao;
    private ArrayList<Pokemon> pokemons;

    public Treinador(int _id, String _nome) {
        super(_id, _nome);
        this.regiao = new Region();
        this.pokemons = new ArrayList<>();
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
    
    
}
