/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import java.util.*;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public abstract class Usuario extends Pessoa {
    private String senha;

    public Usuario(String _nome, String _senha) {
        super(_nome);
        this.senha = _senha;
    }
}
