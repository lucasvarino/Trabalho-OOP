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
        

        System.out.printf("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("");

        Usuario defaultUser = new Usuario(0, nome);
        Treinador treinador = defaultUser.getTreinadores().get(0);

        String escolha = "0";

        while (escolha != "3") {

            System.out.println("");

            System.out.println("Escolha uma ação:");
            System.out.println("1 - Acessar meus pokemons");
            System.out.println("2 - Registrar novo pokémon");
            System.out.println("3 - Editar pokémon");
            System.out.println("4 - Deletar pokémon");
            System.out.println("5 - Sair");

    
            escolha = teclado.nextLine();
            
            switch (escolha) {
                case "1":
                    System.out.println("Acessando pokemons...");

                    limparTela();

                    treinador.imprimePokemons();


                    break;
                case "2":

                    limparTela();
                    System.out.println("Registrando novo Pokemon");

                    System.out.println("Digite o nome do seu pokemon...");
                    String nomePokemon = teclado.nextLine();

                    System.out.println("Digite a altura do seu pokemon...");
                    String altura = teclado.nextLine();

                    System.out.println("Digite o peso do seu pokemon...");
                    String peso = teclado.nextLine();

                    treinador.addPokemon(new Pokemon(id++, nomePokemon, altura, peso));

                    System.out.println("Pokemon adicionado com sucesso!");

                    System.out.println("");

                    System.out.println("Imprimindo a lista de pokemons atuais");

                    treinador.imprimePokemons();

                    teclado = new Scanner(System.in);

                    break;

                case "3":

                    limparTela();

                    if(treinador.getPokemons().isEmpty())
                        break;

                    System.out.println("Selecione um pokemon para editar: ");

                    treinador.imprimePokemons();

                    teclado = new Scanner(System.in);

                    int idEditar = teclado.nextInt();

                    teclado = new Scanner(System.in);

                    if(treinador.verificarId(idEditar)) {
                        System.out.println("Pokemon encontrado, digite os novos valores...");
                        System.out.println("Digite o nome do pokemon: ");

                        nome = teclado.nextLine();

                        System.out.println("Digite a altura do pokemon: ");
                        altura = teclado.nextLine();

                        System.out.println("Digite o peso: ");
                        peso = teclado.nextLine();

                        Pokemon pokemonEditado = new Pokemon(idEditar, nome, altura, peso);

                        treinador.editarPokemon(idEditar, pokemonEditado);

                        teclado = new Scanner(System.in);
                    }

                    break;

                case "4":

                    limparTela();

                    if(treinador.getPokemons().isEmpty())
                        break;

                    System.out.println("Selecione um pokemon para excluir: ");

                    treinador.imprimePokemons();

                    int idExcluir = teclado.nextInt();

                    treinador.deletarPokemon(idExcluir);

                    teclado = new Scanner(System.in);

                    break;
                case "5":
                    System.out.println("Saindo do programa...");
                    return;

                default:
                    System.out.println("Comando não identificado.");
                    break;

            }
        }
    }

    public static void limparTela() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
