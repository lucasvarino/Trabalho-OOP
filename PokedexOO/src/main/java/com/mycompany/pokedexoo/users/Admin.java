/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.users;

import com.mycompany.pokedexoo.pokemon.Pokemon;
import java.io.IOException;
import excecoes.LoginException;
import java.util.*;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class Admin extends Usuario {

    public Admin(String _nome, String _senha) {
        super(_nome, _senha);
    }
    
    public void criaUsuario() {
        
    }
    
    public void editaUsuario(List<Usuario> usuariosBanco, int usuarioId) {
        
    }
    
    public void deletaUsuario() {
        
    }
    
    public static void deletaPokemon(String nome) throws IOException {
        Treinador.getTreinadorAtual().deletarPokemonAtual(Pokemon.getPokemonAtual());
    }

    @Override
    public boolean logar(String username, String senha) throws LoginException {
         if(!"admin@admin.com".equals(username) || !"123456".equals(senha))
         {
            throw new LoginException();
         }
         
         return true;
    }
}
