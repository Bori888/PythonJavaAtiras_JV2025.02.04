
package pyatiratok;
public class Vasar {
    public static void main(String[] args) {
        // Árak
        double sertesAr = 3.5;
        double kecskeAr = 1 + 1.0 / 3.0; // 1 és egyharmad arany
        double juhAr = 0.5;

        // Állatok számának és árainak összegzése
        for (int s = 1; s <= 100; s++) {  // Sertés darabszám, legalább 1, legfeljebb 100
            for (int k = 1; k <= 100; k++) {  // Kecske darabszám, legalább 1, legfeljebb 100
                for (int j = 1; j <= 100; j++) {  // Juh darabszám, legalább 1, legfeljebb 100
                    // Ellenőrizzük, hogy a feltételek teljesülnek
                    if (s + k + j == 100 && (s * sertesAr + k * kecskeAr + j * juhAr) == 100) {
                        System.out.println("Sertés: " + s + ", Kecske: " + k + ", Juh: " + j);
                    }
                }
            }
        }
    }
}
