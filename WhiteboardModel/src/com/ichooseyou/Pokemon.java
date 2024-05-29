package com.ichooseyou;

/*/

 * Class definition to model com.ichooseyou.Pokemon
 */
public class Pokemon {
    //these are the attributes for the com.ichooseyou.Pokemon
    public static final int MIN_LEVEL = 1;
    public static final int MAX_LEVEL = 100;
    private String name;
    private String type;         // eventually 2 types??
    private int level = MIN_LEVEL;
    private Region region;

   //constructors

    public Pokemon(){

    }

    public Pokemon(String name){
        setName(name);
    }

    public Pokemon(String name, String type, int level) {
        this(name);
        setType(type);
        setLevel(level);
    }

    public Pokemon(String name, String type, int level, Region region) {
        this(name, type, level);
        setRegion(region);
    }


    //functions or methods
    public void pokemonChosen(){
        System.out.println("Your " + getName() + " level " + getLevel() + ", is ready for battle!");
    }
    public void pokemonType(){
        System.out.println("Your " + getName() + "'s" + " type " + ", is " + getType() + ".");
    }
    public void pokemonFainted(){
        System.out.println(getName() + " can no longer battle!");
    }


    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getType() {
        return type;
    }
    //Setter for name
    public void setType(String type) {
        this.type = type;
    }

    //Getter for name
    public int getLevel() {
        return level;
    }

    //  setter for level and if statement proving it's
    public void setLevel(int level){
        if (level >= MIN_LEVEL && level <= MAX_LEVEL){
            this.level = level;
        }
        else {
            System.out.println("Your " + getName() + " level " + ", isn't a real pokemon");
        }
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    // toString Method
    public String toString(){
        return getName() + " is a " + getType() + " Pokemon and is level " + getLevel() +
                ". " + getName() + " is from the " + getRegion() + " region.";
    }
}
