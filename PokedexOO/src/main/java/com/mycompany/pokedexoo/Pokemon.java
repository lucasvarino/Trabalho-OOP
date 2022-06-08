/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

import java.util.*;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Pokemon {
    private int id;
    private String nome;
    private String altura;
    private String peso;
    private PokemonType tipo;
    private PokemonSpecies especie;
    private ArrayList<PokemonAbility> habilidades;
    private PokemonSprites sprites;

    public Pokemon(int id, String nome, String altura, String peso) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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
