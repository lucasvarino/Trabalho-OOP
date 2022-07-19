package com.mycompany.interfacepokedex;


import com.mycompany.pokedexoo.Pokemon;
import com.mycompany.pokedexoo.Treinador;
import com.mycompany.pokedexoo.Usuario;
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
    public static void main(String[] args) {
        imprimeInterface();
    }

    public static void imprimeInterface() {
        System.out.println("======================================");
        System.out.println("Pokedex - Gerencie seus pokémons!");
        System.out.println("======================================");
        System.out.println("");

        Scanner teclado = new Scanner(System.in);

        int id = 1;
        

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("");

        Pokemon pokemon = Pokemon.getPokemonByUrl(nome);
        
        pokemon.imprimePokemon();

          
    }

    public static void limparTela() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
