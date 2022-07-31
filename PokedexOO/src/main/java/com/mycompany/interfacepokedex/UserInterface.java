package com.mycompany.interfacepokedex;


import com.mycompany.pokedexoo.pokemon.Pokemon;
import com.mycompany.pokedexoo.users.Treinador;
import com.mycompany.pokedexoo.users.Usuario;
import java.io.IOException;
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

        //InterfaceInicial interfaceInicial = new InterfaceInicial();
        InterfaceInicial interfaceInicial = new InterfaceInicial();
        
        Scanner teclado = new Scanner(System.in);        

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("");

        Pokemon pokemon = Pokemon.getPokemonByUrl(nome);
        
        System.out.println("Pokemon 2");
        String nome2 = teclado.nextLine();
        
        Pokemon pokemon2 = Pokemon.getPokemonByUrl(nome2);
        
        pokemon.imprimePokemon();
        System.out.println("");
        pokemon2.imprimePokemon();
        

    }

    public static void limparTela() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
