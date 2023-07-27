public class PokemonDType {

    private int[] id;
    private PokemonType[] weak;
    private PokemonType[] resist;
    private PokemonType[] immune;

    private PokemonType[] qWeak;
    private PokemonType[] qResist;

    private String name;

    //constructors
    public PokemonDType (PokemonType type){
        this.id = new int[]{type.getId()};
        this.weak = type.getWeak();
        if (type.getResist() != null) {
            this.resist = type.getResist();
        }
        if (type.getImmune() != null) {
            this.immune = type.getImmune();
        }
        this.name = type.getName();
    }

    public PokemonDType(PokemonType t1, PokemonType t2){
        this.id = new int[]{t1.getId(), t2.getId()};
        this.name = (t1.getName() + "/" + t2.getName());
    }

/*
    public PokemonDType(PokemonType t1, PokemonType t2) {
        this.id = new int[]{t1.getId(), t2.getId()};

        PokemonType[] qWeaknesses = new PokemonType[t1.getWeak().length];
        PokemonType[] qResistances = new PokemonType[t2.getResist().length];
        PokemonType[] rWeak = new PokemonType[t1.getWeak().length + t2.getWeak().length];
        PokemonType[] rResist = new PokemonType[1];
        PokemonType[] dImmune = new PokemonType[t1.getImmune().length ];


        //getting weaknesses and resistances
        //t1 weak t2 weak = qWeak
        //t1 weak t2 resist = null
        //t1 weak t2 immune = immune
        //t1 weak t2 null = weak

        //weaknesses + quad weaknesses
        for (int i = 0; i < t1.getWeak().length; i++) {
            int a = 0;
            int b = 0;
            boolean qWeak = false;
            for (int j = 0; j < t2.getWeak().length; j++) {
                if (t1.getWeak()[i] == t2.getWeak()[j]) {
                    qWeaknesses[a] = t1.getWeak()[i];
                    a++;
                    qWeak = true;
                } else {
                    rWeak[b] = t2.getWeak()[j];
                    b++;
                }
            }
            if (!qWeak) {
                rWeak[b] = t1.getWeak()[i];
                b++;
            }
        }
        this.qWeak = qWeaknesses;
        this.weak = rWeak;

        //resistances + quad resistances + immunities
        if (t1.getImmune() != null) {
            for (int i = 0; i < t1.getImmune().length; i++){
                dImmune[i] = t1.getImmune()[i];
            }
        }
        if (t2.getImmune() != null) {
            for (int i = 0; i < t2.getImmune().length; i++) {
                dImmune[i] = t2.getImmune()[i];
            }
        }
        if (t1.getResist() != null) {
            if (t2.getResist() != null) {
                for (int i = 0; i < t1.getResist().length; i++) {
                    int a = 0;
                    int b = 0;
                    boolean qResist = false;
                    for (int j = 0; j < t2.getResist().length; j++) {
                        if (t1.getResist()[i] == t2.getResist()[j]) {
                            qResistances[a] = t1.getResist()[i];
                            a++;
                            qResist = true;
                        } else {
                            rResist[b] = t2.getResist()[j];
                            b++;
                        }
                    }
                    if (!qResist) {
                        rResist[b] = t1.getResist()[i];
                        b++;
                    }
                }
            } else rResist = t1.getResist();
        } else rResist = t2.getResist();

        this.qResist = qResistances;
        this.resist = rResist;

        this.name = t1.getName() + "/" + t2.getName();
    }
 */


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
    public PokemonType[] getqWeak() {
        return qWeak;
    }
    public PokemonType[] getqResist() {
        return qResist;
    }
    public String getName() {
        return name;
    }

    //set properties
    public void setImmune(PokemonType[] immune) {
        this.immune = immune;
    }
    public void setqWeak(PokemonType[] qWeak) {
        this.qWeak = qWeak;
    }
    public void setqResist(PokemonType[] qResist) {
        this.qResist = qResist;
    }
    public void setWeak(PokemonType[] weak) {
        this.weak = weak;
    }
    public void setResist(PokemonType[] resist) {
        this.resist = resist;
    }
}
