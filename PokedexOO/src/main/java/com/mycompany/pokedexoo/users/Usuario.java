/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import excecoes.LoginException;
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

    public String getSenha() {
        return senha;
    }

    public boolean logar(String username, String senha) throws LoginException { //Logar no sistema
         if(!"admin@admin.com".equals(username) || !"123456".equals(senha))
         {
            throw new LoginException();
         }
         
         return true;
    }
}
