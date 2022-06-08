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
public class Admin extends Pessoa {
    private String senha;

    public Admin(String senha, int _id, String _nome) {
        super(_id, _nome);
        this.senha = senha;
    }
    
    public void criaUsuario() {
        
    }
    
    public void editaUsuario(List<Usuario> usuariosBanco, int usuarioId) {

    }
    
    public void deletaUsuario() {
        
    }
}
