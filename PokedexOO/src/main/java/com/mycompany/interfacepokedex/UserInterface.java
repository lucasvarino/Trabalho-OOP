package com.mycompany.interfacepokedex;


import com.mycompany.pokedexoo.pokemon.Pokemon;
import com.mycompany.pokedexoo.users.Jogador;
import com.mycompany.pokedexoo.users.JsonUtil;
import com.mycompany.pokedexoo.users.Treinador;
import com.mycompany.pokedexoo.users.Usuario;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class UserInterface {
    public static void main(String[] args) throws IOException {
        imprimeInterface();
    }

    public static void imprimeInterface() throws IOException {
        System.out.println("======================================");
        System.out.println("Pokedex - Gerencie seus pokémons!");
        System.out.println("======================================");
        System.out.println("");

        InterfaceInicial interfaceInicial = new InterfaceInicial();
        //InterfaceRegistros interfaceRegistros = new InterfaceRegistros();
       
    }

    public static void limparTela() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
