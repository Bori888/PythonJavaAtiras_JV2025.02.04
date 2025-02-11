package pyatiratok;

import java.util.Arrays;

public class Progtetelek {

    static int[] sorozat = {3, 5, 1, 2, 8, 17, 6};//a zárojel más
    static int hossz = sorozat.length; //len() = .length 

    public static void main(String[] args) {
        osszegzes();
        megszamlalas();
        minKivalasztas();
        maxKivalasztas();
        kivalasztas();
        eldontesEgy();
        eldontesMind();
        linearisKereses();

        System.out.println("a sorozat elemei: " + Arrays.toString(sorozat));
        System.out.println("összeg: " + osszegzes());
        System.out.println("páratlanok száma: " + megszamlalas());

        int i = minKivalasztas();
        System.out.printf("Legkisebb elem helye: %d, értéke: %d\n", i, sorozat[i]);

        i = maxKivalasztas();
        System.out.printf("Legnagyobb elem helye: %d, értéke: %d\n", i, sorozat[i]);


        i = kivalasztas();
        System.out.printf("Az első 5-nél nagyobb elem helye: %d, értéke: %d\n", i, sorozat[i]);

        String valasz = eldontesEgy() ? "van" : "nincs";
        System.out.println("Van benne 4-nél nagyobb páros: " + valasz);


        valasz = eldontesMind() ? "igen mind" : "nem mind";
        System.out.println("Minden elem nagyobb 5-nél: " + valasz);


        System.out.print("Ha van benne 0, akkor hol: ");
        i = linearisKereses();
        if (i > -1) {
            System.out.printf("a(z) %d. indexen.\n", i);
        } else {
            System.out.println("Nincs ilyen elem.");
        }

    }

    static int osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < hossz; i++) {
            osszeg += sorozat[i];

        }
        return osszeg;
    }

    static int megszamlalas() {
        int osszeg = 0;
        for (int i = 0; i < hossz; i++) {
            if (sorozat[i] % 2 == 1) {
                osszeg += 1;
            }

        }
        return osszeg;
    }

    static int minKivalasztas() {
        int minIndex = 0;
        for (int i = 1; i < hossz; i++) {
            if (sorozat[i] < sorozat[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int maxKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < hossz; i++) {
            if (sorozat[i] > sorozat[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int kivalasztas() {
        int i = 0;
        while (!(sorozat[i] > 5)) {
            i += 1;

        }
        return i;
    }

    static boolean eldontesEgy() {
        int i = 0;
        while (i < hossz && !(sorozat[i] % 2 == 0 && sorozat[i] > 4)) {
            i += 1;
        }
        return i < hossz;
    }

    static boolean eldontesMind() {
        int i = 0;
        while (i < hossz && sorozat[i] > 5) {
            i += 1;
        }
        return i >= hossz;
    }

    static int linearisKereses() {
        int i = 0;
        while (i < hossz && (!(sorozat[i] == 0))) {
            i += 1;
        }
        if (i < hossz) {
            return i;
        } else {
            return -1;
        }
    }

}
