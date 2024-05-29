package com.ichooseyou.client;

import com.ichooseyou.Pokemon;
import com.ichooseyou.Region;

/*
 *
 */
class PokemonClient {
    public static void main(String[] args) {
        Pokemon pkmn1 = new Pokemon();
        pkmn1.setName("Pikachu");
        pkmn1.setLevel(17);
        pkmn1.setType("electric");
        pkmn1.setRegion(Region.KANTO);
        System.out.println(pkmn1);

        Pokemon pkmn2 = new Pokemon();
        pkmn2.setName("Charmander");
        pkmn2.setLevel(1);
        pkmn2.setType("fire");
        pkmn2.setRegion(Region.KANTO);
        System.out.println(pkmn2);

        Pokemon pkmn3 = new Pokemon();
        pkmn3.setName("Treeko");
        pkmn3.setLevel(14);
        pkmn3.setType("grass");
        pkmn3.setRegion(Region.HOENN);
        System.out.println(pkmn3);

        Pokemon pkmn4 = new Pokemon();
        pkmn4.setName("Piplup");
        pkmn4.setLevel(12);
        pkmn4.setType("water");
        pkmn4.setRegion(Region.SINNOH);
        System.out.println(pkmn4);

        Pokemon pkmn5 = new Pokemon();
        pkmn5.setName("Mew");
        pkmn5.setLevel(100);
        pkmn5.setType("psychic");
        pkmn5.setRegion(Region.KANTO);
        System.out.println(pkmn5);

        Pokemon pkmn6 = new Pokemon();
        pkmn6.setName("Cyndaquil");
        pkmn6.setLevel(5);
        pkmn6.setType("fire");
        pkmn6.setRegion(Region.JHOTO);
        System.out.println(pkmn6);

        Pokemon pkmn7 = new Pokemon();
        pkmn7.setName("Davis");
        pkmn7.setLevel(105);
        System.out.println(pkmn7);



        pkmn5.pokemonChosen();
        pkmn4.pokemonChosen();
        pkmn1.pokemonFainted();
        pkmn5.pokemonType();
        System.out.println(pkmn1.toString());
        System.out.println(pkmn2.toString());


    }
}
