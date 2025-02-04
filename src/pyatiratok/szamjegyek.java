package pyatiratok;

import java.util.Scanner;//skenner bekérés

public class szamjegyek {
    static final Scanner scanner = new Scanner(System.in);//skenner bekérés

    public static void main(String[] args) {
        

        System.out.print("_i_smétléssel v. _n_élküle? (i/n): ");
        String tipus = scanner.nextLine();//skenner bekérés
        System.out.print("2,3,4 jegyekből a számok");
        boolean ism;//tipust adunk de értéket nem(nem inicializálunk)
        if ("i".equals(tipus)) {
            ism = true;
            System.out.println(" ismétléssel");
        } else {
            ism = false;
            System.out.println(" ismétlés nélkül");
        }

        
        //1.B feladat ---------------------------------------
        System.out.print("_i_smétléssel v. _n_élküle? (i/n): ");
        boolean ism2 = scanner.nextLine() == "i";//lerovidetük egy ternális operátorral a ism értékadását és scener 2. soreát
        System.out.print("2,3,4 jegyekből a számok");
        String ki = ism2 ? "ismetléssal":"ism nélkul";
        System.out.println(ki);

        //2. feladat---------------------------------------
        ism = true;
        int db_ism = 0;
        int db_ism_nlk = 0;

        for (int i = 2; i <= 4; i++) {
            for (int j = 2; j <= 4; j++) {
                for (int k = 2; k <= 4; k++) {

                    if (ism) {
                        db_ism++;
                        System.out.println(i + "" + j + "" + k);  // Formázott kiírás
                    } else if (i != j && i != k && j != k) {
                        db_ism_nlk++;
                        System.out.println(i + "" + j + "" + k);  // Formázott kiírás
                    }
                }
            }
        }

        // Statisztika kiírása
        if (ism) {
            System.out.println("Az esetek száma ismétléssel: " + db_ism);
        } else {
            System.out.println("Az esetek száma ismétlés nélkül: " + db_ism_nlk);
        }

    }

}
