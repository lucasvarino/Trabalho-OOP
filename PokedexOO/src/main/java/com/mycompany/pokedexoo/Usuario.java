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
public class Usuario extends Pessoa {
    private ArrayList<Treinador> treinadores;

    public Usuario(int _id, String _nome) {
        super(_id, _nome);
        this.treinadores = new ArrayList<>();
        this.treinadores.add(new Treinador(0, "Ash"));
    }

    public ArrayList<Treinador> getTreinadores() {
        return treinadores;
    }

    public void setTreinador(Treinador treinador) {
        this.treinadores.add(treinador);
    }

    public void imprimeNomesTreinadores() {
        for (Treinador treinador : treinadores) {
            System.out.println(treinador.getNome());
        }
    }



}
