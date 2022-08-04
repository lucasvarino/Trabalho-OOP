package com.mycompany.interfacepokedex;



import java.io.IOException;


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
    
     public static String upperCaseFirst(String val) {
      char[] arr = val.toCharArray();
      arr[0] = Character.toUpperCase(arr[0]);
      return new String(arr);
   }
}
