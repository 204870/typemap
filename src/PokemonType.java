public class PokemonType {

    private int id;
    private PokemonType[] weak;
    private PokemonType[] resist;
    private PokemonType[] immune;

    //incase I wanna do sound type shenanigans the list is here !
    private String name;
    private static String[] typeNames = {"Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy"};


    //constructors (idk what do with normal lol)
    public PokemonType(int id){
        this.id = id;
    }

    public PokemonType(int id, PokemonType[] weak, PokemonType[] resist){
        this.id = id;
        this.weak = weak;
        this.resist = resist;
    }

    public PokemonType(int id, PokemonType[] weak, PokemonType[] resist, PokemonType[] immune){
        this.id = id;
        this.weak = weak;
        this.resist = resist;
        this.immune = immune;
    }

    //functions

    public static int numberOfTypes(){
        return typeNames.length;
    }

    public String getName() {
        if (id <= typeNames.length){
            return typeNames[id];
        }
        System.out.println("Unable to match type");
        return null;
    }

    //set properties
    public void setWeak(PokemonType[] weak) {
        this.weak = weak;
    }

    public void setResist(PokemonType[] resist) {
        this.resist = resist;
    }

    public void setImmune(PokemonType[] immune) {
        this.immune = immune;
    }

    //get properties

    public PokemonType[] getWeak() {
        return weak;
    }

    public PokemonType[] getResist() {
        return resist;
    }

    public PokemonType[] getImmune() {
        return immune;
    }

    public int getId() {
        return id;
    }
}
