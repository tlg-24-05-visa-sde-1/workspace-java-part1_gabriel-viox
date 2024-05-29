package com.ichooseyou.client;

import com.ichooseyou.Pokemon;
import com.ichooseyou.Region;

public class PokemonClientArguments {
    public static void main(String[] args){
        if (args.length < 4 ){
            String usage = "Usage: java com.ichooseyou.client.PokemonClientArguments <name> <type> <level> <region>";
            String example = "java com.ichooseyou.client.PokemonClientArguments Pikachu electric 17 KANTO ";
            String note = "Pokemon are only from these regions: KANTO, JHOTO, HOENN, SINNOH, UNOVA, KALOS, ALOLA, GALAR, PALDEA ";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }
        System.out.println("Provided " + args.length + " arguments");

        //step 1 convert from string to proper type
        String name = args[0];
        String type = args[1];
        int level = Integer.parseInt(args[2]);
        Region region = Region.valueOf(args[3].toUpperCase());

        // step 2 create Pokemon object from these 4 values
        Pokemon pokemon = new Pokemon(name, type, level, region);
        System.out.println(pokemon);

        // step 3 report your Pokémon's Pokédex entry!
        System.out.println("Your Pokemon is " + pokemon);
        System.out.println("Your Pokemon's region is " + region);
        System.out.println("Your Pokemon's level is " + level);

    }
}
