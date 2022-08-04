/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedexoo.pokemon;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class PokemonTypeSlot { // Classe usada apenas para mapping
    private final int slot;
    private final PokemonType type;

    public PokemonTypeSlot(int slot, PokemonType type) {
        this.slot = slot;
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public PokemonType getType() {
        return type;
    }
    
    
    
    
}
