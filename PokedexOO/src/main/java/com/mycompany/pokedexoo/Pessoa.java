/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public abstract class Pessoa {
    protected static int id;
    protected String nome;

    public Pessoa(int _id, String _nome) {
        id++;
        this.nome = "";
    }

    public int getId() {
        return Pessoa.id;
    }

    public void setId(int id) {
        Pessoa.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
