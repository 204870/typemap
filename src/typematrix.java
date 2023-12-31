import java.util.Scanner;

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

    //just generally helpful methods that make my life easier / put me at ease because I care about big o
    public static double factorial(double base){
        for(int i = (int)base-1; i > 0; i--){
            //System.out.println(base + " - " + i);
            base = base * (double)i;
        }
        return base;
    }

    public static boolean binarySearch(PokemonType[] types, int target){
        if (types == null) return false;
        int low = 0;
        int high = types.length - 1;

        while (low <= high){
            int mid = low + (int)Math.floor((double)(high - low)/2);
            if (types[mid].getId() < target){
                low = mid + 1;
            } else if (types[mid].getId() > target){
                high = mid - 1;
            } else if (types[mid].getId() ==  target){
                return true;
            }
        }
        return false;
    }

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
        resist = new PokemonType[]{types[1], types[6], types[11]};
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
        resist = new PokemonType[]{types[8], types[11], types[12], types[14]};
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

    //dual types
    public static PokemonDType[] dualTypes(PokemonType[] types) {
        //amount of combinations of dual types using (n + k - 1)! / (k!(n-1)!)
        double m = ((factorial(types.length + 2 - 1)) / (factorial(2) * (factorial(types.length - 1))));
        int n = (int) m;
        PokemonDType[] dTypes = new PokemonDType[n];
        System.out.println("there are " + n + " different dual type combinations");
        int k = 0;
        for (int i = 0; i < types.length; i++) {
            for (int j = i; j < types.length; j++) {
                if (i == j) {
                    //Pure Typings
                    //System.out.println("Attempting to create pure " + types[i].getName());
                    dTypes[k] = new PokemonDType(types[i]);
                } else {
                    //Dual Typings
                    //System.out.println("Attempting to create " + types[i].getName() + "/" + types[j].getName());
                    dTypes[k] = new PokemonDType(types[i], types[j]);

                    //immunities
                    if ((types[i].getImmune() != null) || (types[j].getImmune() != null)) {
                        //number of immunities
                        int im = 0;
                        if (types[i].getImmune() != null) im = im + types[i].getImmune().length;
                        if (types[j].getImmune() != null) im = im + types[j].getImmune().length;

                        PokemonType[] tempIm = new PokemonType[im];

                        //adding immunities
                        int x = 0;
                        if (types[i].getImmune() != null) {
                            for (int l = 0; l < types[i].getImmune().length; l++) {
                                tempIm[x] = types[i].getImmune()[l];
                                x++;
                            }
                        }
                        if (types[j].getImmune() != null) {
                            for (int l = 0; l < types[j].getImmune().length; l++) {
                                tempIm[x] = types[j].getImmune()[l];
                                x++;
                            }
                        }
                        dTypes[k].setImmune(tempIm);
                    }

                    //quad weaknesses
                    if ((types[i].getWeak() != null) || (types[j].getWeak() != null)) {
                        int x = 0;

                        //amount of quad weaknesses
                        for (int l = 0; l < types[i].getWeak().length; l++) {
                            if (binarySearch(types[j].getWeak(), types[i].getWeak()[l].getId())) {
                                x++;
                            }
                        }
                        if (x > 0) {
                            PokemonType[] tempqWeak = new PokemonType[x];
                            x = 0;

                            //adding quad weaknesses
                            for (int l = 0; l < types[i].getWeak().length; l++) {
                                if (binarySearch(types[j].getWeak(), types[i].getWeak()[l].getId())) {
                                    tempqWeak[x] = types[i].getWeak()[l];
                                    x++;
                                }
                            }
                            dTypes[k].setqWeak(tempqWeak);
                        }
                    }

                    //quad resistances
                    if ((types[i].getResist() != null) && (types[j].getResist() != null)) {
                        int x = 0;

                        //amount of quad resistances
                        for (int l = 0; l < types[i].getResist().length; l++) {
                            if (binarySearch(types[j].getResist(), types[i].getResist()[l].getId())) {
                                x++;
                            }
                        }
                        if(x > 0) {
                            PokemonType[] tempqResist = new PokemonType[x];
                            x = 0;

                            //adding quad resistances
                            for (int l = 0; l < types[i].getResist().length; l++) {
                                if (binarySearch(types[j].getResist(), types[i].getResist()[l].getId())) {
                                    tempqResist[x] = types[i].getResist()[l];
                                    x++;
                                }
                            }
                            dTypes[k].setqResist(tempqResist);
                        }
                    }

                    //regular weaknesses
                    if ((types[i].getWeak() != null) || (types[j].getWeak() != null)){
                        int x = 0;
                        //number of regular weaknesses

                        //types[i] against types[j]
                        if (types[i].getWeak() != null) {
                            if (types[j].getResist() != null) {
                                //excluding types that types[i] is weak to but types[j] resists
                                for(int l = 0; l < types[i].getWeak().length; l++){
                                    //there's probably a better method than this horrible if statement for this lmao. I might have to make a new Effectiveness class.
                                    if ((binarySearch(types[j].getResist(), types[i].getWeak()[l].getId()) == false) && (binarySearch(types[j].getWeak(), types[i].getWeak()[l].getId()) == false) && (binarySearch(types[j].getImmune(), types[i].getWeak()[l].getId()) == false)){
                                        x++;
                                    }
                                }
                            }
                            else{
                                x = x + types[i].getWeak().length;
                            }
                        }
                        //types[j] against types[i]
                        if (types[j].getWeak() != null) {
                            if (types[i].getResist() != null) {
                                //excluding types that types[j] is weak to but types[i] resists
                                for(int l = 0; l < types[j].getWeak().length; l++){
                                    if ((binarySearch(types[i].getResist(), types[j].getWeak()[l].getId()) == false) && (binarySearch(types[i].getWeak(), types[j].getWeak()[l].getId()) == false) && (binarySearch(types[i].getImmune(), types[j].getWeak()[l].getId()) == false)){
                                        x++;
                                    }
                                }
                            }
                            else{
                                x = x + types[j].getWeak().length;
                            }
                        }

                        if (x > 0) {
                            PokemonType[] tempWeak = new PokemonType[x];
                            x = 0;

                            //adding regular weaknesses
                            //types[i] against types[j]
                            if (types[i].getWeak() != null) {
                                if (types[j].getResist() != null) {
                                    //excluding types that types[i] is weak to but types[j] resists
                                    for (int l = 0; l < types[i].getWeak().length; l++) {
                                        if ((binarySearch(types[j].getResist(), types[i].getWeak()[l].getId()) == false) && (binarySearch(types[j].getWeak(), types[i].getWeak()[l].getId()) == false) && (binarySearch(types[j].getImmune(), types[i].getWeak()[l].getId()) == false)) {
                                            tempWeak[x] = types[i].getWeak()[l];
                                            x++;
                                        }
                                    }
                                } else {
                                    for (int l = 0; l < types[i].getWeak().length; l++) {
                                        tempWeak[x] = types[i].getWeak()[l];
                                        x++;
                                    }
                                }
                            }

                            //types[j] against types[i]
                            if (types[j].getWeak() != null) {
                                if (types[i].getResist() != null) {
                                    //excluding types that types[i] is weak to but types[j] resists
                                    for (int l = 0; l < types[j].getWeak().length; l++) {
                                        if ((binarySearch(types[i].getResist(), types[j].getWeak()[l].getId()) == false) && (binarySearch(types[i].getWeak(), types[j].getWeak()[l].getId()) == false) && (binarySearch(types[i].getImmune(), types[j].getWeak()[l].getId()) == false)) {
                                            tempWeak[x] = types[j].getWeak()[l];
                                            x++;
                                        }
                                    }
                                } else {
                                    for (int l = 0; l < types[j].getWeak().length; l++) {
                                        tempWeak[x] = types[j].getWeak()[l];
                                        x++;
                                    }
                                }
                            }

                            dTypes[k].setWeak(tempWeak);
                        }
                    }

                    //regular resistances
                    if ((types[i].getResist() != null) || (types[j].getResist() != null)) {
                        int x = 0;
                        //number of regular resistances

                        //types[i] against types[j]
                        if (types[i].getResist() != null) {
                            if (types[j].getWeak() != null) {
                                //excluding types that types[i] is weak to but types[j] resists
                                for (int l = 0; l < types[i].getResist().length; l++) {
                                    if ((binarySearch(types[j].getWeak(), types[i].getResist()[l].getId()) == false) && (binarySearch(types[j].getResist(), types[i].getResist()[l].getId()) == false) && (binarySearch(types[j].getImmune(), types[i].getResist()[l].getId()) == false)) {
                                        x++;
                                    }
                                }
                            } else {
                                x = x + types[i].getResist().length;
                            }
                        }
                        //types[j] against types[i]
                        if (types[j].getResist() != null) {
                            if (types[i].getWeak() != null) {
                                //excluding types that types[j] is weak to but types[i] resists
                                for (int l = 0; l < types[j].getResist().length; l++) {
                                    if ((binarySearch(types[i].getWeak(), types[j].getResist()[l].getId()) == false) && (binarySearch(types[i].getResist(), types[j].getResist()[l].getId()) == false) && (binarySearch(types[i].getImmune(), types[j].getResist()[l].getId()) == false)) {
                                        x++;
                                    }
                                }
                            } else {
                                x = x + types[j].getResist().length;
                            }
                        }

                        PokemonType[] tempResist = new PokemonType[x];
                        x = 0;

                        //types[i] against types[j]
                        if (types[i].getResist() != null) {
                            if (types[j].getWeak() != null) {
                                //excluding types that types[i] is weak to but types[j] resists
                                for (int l = 0; l < types[i].getResist().length; l++) {
                                    if ((binarySearch(types[j].getWeak(), types[i].getResist()[l].getId()) == false) && (binarySearch(types[j].getResist(), types[i].getResist()[l].getId()) == false) && (binarySearch(types[j].getImmune(), types[i].getResist()[l].getId()) == false)) {
                                        tempResist[x] = types[i].getResist()[l];
                                        x++;
                                    }
                                }
                            } else {
                                for (int l = 0; l < types[i].getResist().length; l++) {
                                    tempResist[x] = types[i].getResist()[l];
                                    x++;
                                }
                            }
                        }

                        //types[j] against types[i]
                        if (types[j].getResist() != null) {
                            if (types[i].getWeak() != null) {
                                //excluding types that types[i] is weak to but types[j] resists
                                for (int l = 0; l < types[j].getResist().length; l++) {
                                    if ((binarySearch(types[i].getWeak(), types[j].getResist()[l].getId()) == false) && (binarySearch(types[i].getResist(), types[j].getResist()[l].getId()) == false) && (binarySearch(types[i].getImmune(), types[j].getResist()[l].getId()) == false)) {
                                        tempResist[x] = types[j].getResist()[l];
                                        x++;
                                    }
                                }
                            } else {
                                for (int l = 0; l < types[j].getResist().length; l++) {
                                    tempResist[x] = types[j].getResist()[l];
                                    x++;
                                }
                            }
                        }

                        dTypes[k].setResist(tempResist);
                    }

                }
                k++;
            }
        }
        return dTypes;
    }

    //dual type setup
    public static void setDualTypes(PokemonDType[] dualTypes, PokemonType[] types){

    }

    public static void printDualInfo(PokemonDType[] types){
        //int w, r, m = 0;
        for (int i = 0; i < types.length; i++){
            System.out.println("The " + types[i].getName() + " type combination has:");
            if (types[i].getqWeak() != null){
                System.out.println(types[i].getqWeak().length + " 4x weaknesses");
                for(int j = 0; j < types[i].getqWeak().length; j++){
                    System.out.println("- "+types[i].getqWeak()[j].getName());
                }
            }
            if (types[i].getWeak() != null){
                System.out.println(types[i].getWeak().length + " 2x weaknesses");
                for(int j = 0; j < types[i].getWeak().length; j++){
                    System.out.println("- "+types[i].getWeak()[j].getName());
                }
            }
            if (types[i].getResist() != null){
                System.out.println(types[i].getResist().length + " 0.5x resistances");
                for(int j = 0; j < types[i].getResist().length; j++){
                    System.out.println("- "+types[i].getResist()[j].getName());
                }
            }
            if (types[i].getqResist() != null){
                System.out.println(types[i].getqResist().length + " 0.25x resistances");
                for(int j = 0; j < types[i].getqResist().length; j++){
                    System.out.println("- "+types[i].getqResist()[j].getName());
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
        PokemonDType[] dualTypes = dualTypes(types);
        Scanner in = new Scanner(System.in);
        int choice = 0;
        String options = ("\n0. nothing lol\n1. Single type weaknesses/resistances\n2. Dual type weaknesses/resistances\n3. Adjacency matrix for Weaknesses\n4. Adjacency matrix for resistances\n5. Leave :(");
        System.out.println("Hello! What would you like to do today? (type a number!!)" + options);
        while (choice != 5) {
            if ((choice < 0) && (choice > 5))System.out.println("Pick a number 1-5 plzz" + options);
            else if (choice > 0) System.out.println("Anything else you'd like to do?" + options);
            choice = in.nextInt();
            if (choice == 1) printInfo(types);
            else if (choice == 2) printDualInfo(dualTypes);
            else if (choice == 3) printMatrix(weakMatrix(types));
            else if (choice == 4) printMatrix(resistMatrix(types));
        }

        System.out.println("Bye! Have a nice day :D");
        //matrix(typesString);



/*
        System.out.println("The Adjacency Matrix for Weaknesses");
        printMatrix(weakMatrix(types));

        System.out.println("The Adjacency Matrix for Resistances");
        printMatrix(resistMatrix(types));

 */

    }
}
