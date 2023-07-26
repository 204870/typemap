public class PokemonDType {

    private int[] id;
    private PokemonType[] weak;
    private PokemonType[] resist;
    private PokemonType[] immune;

    private PokemonType[] qWeak;
    private PokemonType[] qResist;

    private String[] names;

    //constructors
    public PokemonDType(PokemonType type){
        this.id[0] = type.getId();
        this.weak = type.getWeak();
        if (type.getResist() != null) {
            this.resist = type.getResist();
        }
        if (type.getImmune() != null) {
            this.resist = type.getImmune();
        }
        this.names[0] = type.getName();
    }

    public PokemonDType(PokemonType t1, PokemonType t2){
        this.id[0] = t1.getId();
        this.id[1] = t2.getId();

        //getting weaknesses and resistances
        //t1 weak t2 weak = qWeak
        //t1 weak t2 resist = null
        //t1 weak t2 null = weak
        //t1 weak t2 immune = immune
        for(int i = 0; i < t1.getWeak().length; i++){
            
        }
    }
}
