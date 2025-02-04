package pyatiratok;

import java.util.Random;//véletlenszám tanulása 

public class Ciklusok {//-->tipus

    static final Random random = new Random();//véletlenszám tanulása 

    public static void main(String[] args) {
        System.out.println("az első 10 +páros szám összege: ");
        int osszeg = 0;
        int db = 0;
        int szam = 0;
        while (db < 10) {
            System.out.println(szam + ",");
            osszeg += szam;
            szam += 2;
            db += 1;
            

        }
        System.out.println("\nösszesen: " + osszeg);
        //Másodikfeladat----------------------------------------------------
        //véletlenszám tanulása 
        System.out.println("\n10..15 közötti számok, kivéve 13:");
        int n = random.nextInt(10, 16);//véletlenszám tanulása 
        while (n != 13) {
            System.out.println(n + " ");
            n = random.nextInt(10, 16);
        }
        System.out.println("\n");

        //3. feladat---------------------------------------------------------
        System.out.println("egyjegyű számok (for): " + "");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

        System.out.println("");

        //3. feladat b-------------------------------------------
        System.out.println("egyjegyű számok (while): ");
        int i = 0;
        while (i < 10) {
            System.out.println(i + "");
            i += 1;
        }
        System.out.println("");

        //4.feladat---------------------------------------------
        System.out.println("páratlan egyjegyű számok: ");

        for (int j = 1; j < 10; j+=2) {
            System.out.println(j + " ");
        }
        System.out.println("");
        
        
        
        //5. feladat--------------------------
        System.out.println("\n3 - -3-ig abs értékben:");
        for (int k = 3; k > -4; k--) {
             //System.out.println("|"+k+"| = "+Math.abs(k));
             System.out.printf("|%2d| = %2d\n", k, Math.abs(k));//formázott kiiratással
        }////////////////////////a%d =>belletszi azt a változo értéket ameik,-vel van utána, f string máshogy
        ////////////////////////a2d 2 helyet fogal el ez a formázott kiiratás
        
           
        }

}
