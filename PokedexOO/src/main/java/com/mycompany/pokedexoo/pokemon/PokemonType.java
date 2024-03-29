package com.mycompany.pokedexoo.pokemon;

/**
 * autores:
 * João Pedro Banhato Pereira (202165506B)
 * Lucas de Oliveira Varino (202165090A)
 */
public class PokemonType { // Classe usada apenas para mapping
    private final String name;
    private final String url;

    public PokemonType(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    
    
}
