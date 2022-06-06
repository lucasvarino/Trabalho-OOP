
import com.mycompany.pokedexoo.Usuario;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ice
 */
public class UserInterface {
    public static void main(String[] args) {
        
    }
    
    public static void imprimeInterface() {
        System.out.println("======================================");
        System.out.println("Pokedex - Gerencie seus pokémons!");
        System.out.println("======================================");
        System.out.println("");
        
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("");
        
        
        Usuario defaultUser = new Usuario(0, nome);
        
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Acessar meus pokemons");
        System.out.println("2 - Registrar novo pokémon");
        System.out.println("3 - Sair");
        

        
        int escolha = teclado.nextInt();
        
        switch (escolha) {
            case 1:
                
        }
    }
}
