package com.ichooseyou.test;

import com.ichooseyou.Pokemon;

class PokemonValidationTest {
    public static void main(String[] args) {
        Pokemon pkmn = new Pokemon();

        pkmn.setLevel(1);
        System.out.println(pkmn);

        pkmn.setLevel(101);
        System.out.println(pkmn);

        pkmn.setLevel(0);
        System.out.println(pkmn);

    }
}