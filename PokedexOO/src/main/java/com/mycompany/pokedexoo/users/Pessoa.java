/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public abstract class Pessoa {
    protected static int totalPessoas;
    protected int id;
    protected String nome;

    public Pessoa(String _nome) {
        this.id = Pessoa.totalPessoas;
        totalPessoas++;
        this.nome = _nome;
    }

    public int getId() {
        return this.id;
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
    
}
