public class typematrix {

    /*
    Types correspond to integers from 0 to 17. They are as follows:
    0 - Normal
    1 - Fighting
    2 - Flying
    3 - Poison
    4 - Ground
    5 - Rock
    6 - Bug
    7 - Ghost
    8 - Steel
    9 - Fire
    10 - Water
    11 - Grass
    12 - Electric
    13 - Psychic
    14 - Ice
    15 - Dragon
    16 - Dark
    17 - Fairy

    18 - Sound*

    * not implemented / fake type

     */

    //lists out all possible type combinations without repeats
    public static void matrix(String[] types) {
        int k = 0;
        for (int i = 0; i < types.length; i++) {
            for (int j = i; j < types.length; j++) {
                k++;
                if (i == j) {
                    System.out.println(k + "," + "no. " + k + "," + types[i] + ",");
                } else {
                    System.out.println(k + "," + "no. " + k + "," + types[i] + "," + types[j]);
                }
            }
        }
    }

    //lists out all types, just used this to help myself lol
    public static void list(String[] types) {
        for (int i = 0; i < types.length; i++) {
            System.out.println(i + " - " + types[i]);
        }

    }

    public static PokemonType[] initTypes(){
        int x = PokemonType.numberOfTypes();
        PokemonType[] typeArray = new PokemonType[x];

        for (int i = 0; i < x; i++){
            typeArray[i] = new PokemonType(i);
        }

        return typeArray;
    }

    public static String[] typeString(PokemonType[] types){
        String[] x = new String[types.length];

        for (int i = 0; i < types.length; i ++){
            x[i] = types[i].getName();
        }

        return x;
    }

    public static void setTypes(PokemonType[] types){
        PokemonType[] weak = new PokemonType[1];
        PokemonType[] resist = new PokemonType[1];
        PokemonType[] immune = new PokemonType[1];
        int i = 0;

        //normal - 0
        weak = new PokemonType[]{types[1]};
        immune = new PokemonType[]{types[7]};
        types[i].setWeak(weak);
        types[i].setImmune(immune);
        i++;

        //fighting - 1
        weak = new PokemonType[]{types[2], types[13], types[17]};
        resist = new PokemonType[]{types[5], types[6], types[16]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //flying - 2
        weak = new PokemonType[]{types[5], types[12], types[14]};
        resist = new PokemonType[]{types[2], types[6], types[11]};
        immune = new PokemonType[]{types[4]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;

        //poison - 3
        weak = new PokemonType[]{types[4], types[13]};
        resist = new PokemonType[]{types[1], types[3], types[6], types[11], types[17]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //ground - 4
        weak = new PokemonType[]{types[10], types[11], types[14]};
        resist = new PokemonType[]{types[3], types[5]};
        immune = new PokemonType[]{types[12]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;

        //rock - 5
        weak = new PokemonType[]{types[1], types[4], types[8], types[10], types[11]};
        resist = new PokemonType[]{types[0], types[2], types[3], types[9]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //bug - 6
        weak = new PokemonType[]{types[2], types[5], types[9]};
        resist = new PokemonType[]{types[1], types[4], types[11]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //ghost - 7
        weak = new PokemonType[]{types[7], types[16]};
        resist = new PokemonType[]{types[3], types[6]};
        immune = new PokemonType[]{types[0], types[1]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;

        //steel - 8
        weak = new PokemonType[]{types[1], types[4], types[9]};
        resist = new PokemonType[]{types[0], types[2], types[5], types[6], types[8], types[11], types[13], types[14], types[15], types[17]};
        immune = new PokemonType[]{types[3]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;

        //fire - 9
        weak = new PokemonType[]{types[2], types[5], types[9]};
        resist = new PokemonType[]{types[6], types[8], types[11], types[14], types[17]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //water - 10
        weak = new PokemonType[]{types[11], types[12]};
        resist = new PokemonType[]{types[8], types[9], types[10], types[14]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //grass - 11
        weak = new PokemonType[]{types[2], types[3], types[6], types[9], types[14]};
        resist = new PokemonType[]{types[8], types[9], types[11], types[14]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //electric - 12
        weak = new PokemonType[]{types[4]};
        resist = new PokemonType[]{types[2], types[8], types[12]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //psychic - 13
        weak = new PokemonType[]{types[6], types[7], types[16]};
        resist = new PokemonType[]{types[1], types[13]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //ice - 14
        weak = new PokemonType[]{types[1], types[5], types[8], types[9]};
        resist = new PokemonType[]{types[14]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //dragon - 15
        weak = new PokemonType[]{types[14], types[15], types[17]};
        resist = new PokemonType[]{types[9], types[10], types[11], types[12]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        i++;

        //dark - 16
        weak = new PokemonType[]{types[1], types[6], types[17]};
        resist = new PokemonType[]{types[7], types[16]};
        immune = new PokemonType[]{types[13]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;

        //fairy - 17
        weak = new PokemonType[]{types[3], types[8]};
        resist = new PokemonType[]{types[1], types[6], types[16]};
        immune = new PokemonType[]{types[15]};
        types[i].setWeak(weak);
        types[i].setResist(resist);
        types[i].setImmune(immune);
        i++;
    }

    public static void printInfo(PokemonType[] types){
        //int w, r, m = 0;
        for (int i = 0; i < types.length; i++){
            System.out.println("The " + types[i].getName() + " type has:");
            if (types[i].getWeak() != null){
                System.out.println(types[i].getWeak().length + " weaknesses");
                for(int j = 0; j < types[i].getWeak().length; j++){
                    System.out.println("- "+types[i].getWeak()[j].getName());
                }
            }
            if (types[i].getResist() != null){
                System.out.println(types[i].getResist().length + " resistances");
                for(int j = 0; j < types[i].getResist().length; j++){
                    System.out.println("- "+types[i].getResist()[j].getName());
                }
            }
            if (types[i].getImmune() != null){
                System.out.println(types[i].getImmune().length + " immunities");
                for(int j = 0; j < types[i].getImmune().length; j++){
                    System.out.println("- "+types[i].getImmune()[j].getName());
                }
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix[1].length; i++){
            System.out.println();
            for(int j = 0; j < matrix[1].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int[][] weakMatrix(PokemonType[] types){
        int[][] matrix = new int[types.length][types.length];
        for (int i = 0; i < types.length; i++){
            for (int j = 0; j < types[i].getWeak().length; j++){
                matrix[i][types[i].getWeak()[j].getId()] = 1;
            }
        }
        return matrix;
    }

    public static int[][] resistMatrix(PokemonType[] types){
        int[][] matrix = new int[types.length][types.length];
        for (int i = 0; i < types.length; i++){
            if (types[i].getResist() != null) {
                for (int j = 0; j < types[i].getResist().length; j++) {
                    matrix[i][types[i].getResist()[j].getId()] = 1;
                }
            }
        }
        return matrix;
    }

/*
    public static void ohJson(PokemonType[] types){
        System.out.println("[");
        for (int i = 0; i < types.length; i++) {
            System.out.print("{\"name\":\"flare.boing.");
            System.out.print(types[i].getName()+"\",\"size\":6969,\"imports\":[");
            for (int j = 0; j < types[i].getWeak().length; j++){
                System.out.print("\"flare.boing." + types[i].getWeak()[j].getName() + "\"");
                if ((types[i].getWeak().length - j) > 1){
                    System.out.print(",");
                }
                else System.out.print("]},");
            }

            System.out.println();
        }
    }

 */



    public static void main(String[] args) {
        PokemonType[] types = initTypes();
        String[] typesString = typeString(types);
        setTypes(types);
        //matrix(typesString);
        printInfo(types);
/*
        System.out.println("The Adjacency Matrix for Weaknesses");
        printMatrix(weakMatrix(types));

        System.out.println("The Adjacency Matrix for Resistances");
        printMatrix(resistMatrix(types));

 */

    }
}
