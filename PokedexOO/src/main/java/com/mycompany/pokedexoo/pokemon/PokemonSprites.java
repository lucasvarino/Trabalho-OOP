package com.mycompany.pokedexoo.pokemon;

import com.google.gson.annotations.SerializedName;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class PokemonSprites {
    @SerializedName("front_default")
    private final String sprite;

    public PokemonSprites(String sprite) {
        this.sprite = sprite;
    }

    public String getSprite() {
        return sprite;
    }
    
    
}
