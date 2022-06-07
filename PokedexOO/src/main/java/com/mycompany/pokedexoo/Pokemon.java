/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import java.util.*;

/**
 *
 * @author jpbba
 */
public class Pokemon {
    private String id;
    private String nome;
    private Double altura;
    private Double peso;
    private PokemonType tipo;
    private PokemonSpecies especie;
    private ArrayList<PokemonAbility> habilidades;
    private PokemonSprites sprites;

    public Pokemon(String id, String nome, Double altura, Double peso) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public PokemonType getTipo() {
        return tipo;
    }

    public void setTipo(PokemonType tipo) {
        this.tipo = tipo;
    }

    public PokemonSpecies getEspecie() {
        return especie;
    }

    public void setEspecie(PokemonSpecies especie) {
        this.especie = especie;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }
}
