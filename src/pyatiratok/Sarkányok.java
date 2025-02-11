package pyatiratok;

import java.util.Scanner;

public class Sarkányok {
    public static void main(String[] args) {
        // Scanner a felhasználói input kezeléséhez
        Scanner scanner = new Scanner(System.in);

        // Felhasználói inputok
        System.out.print("Hányfeju az első sárkány: ");
        int hanyfeju1 = scanner.nextInt();
        System.out.print("Hányfeju a második sárkány: ");
        int hanyfeju2 = scanner.nextInt();
        System.out.print("Mennyi összesen a fejek száma: ");
        int fejekSzama = scanner.nextInt();

        // Ciklusok a lehetséges kombinációk keresésére
        for (int x = 0; x <= fejekSzama / hanyfeju1; x++) {
            for (int y = 0; y <= fejekSzama / hanyfeju2; y++) {
                if (hanyfeju1 * x + hanyfeju2 * y == fejekSzama) {
                    System.out.println(hanyfeju1 + " fejű: " + x + " db");
                    System.out.println(hanyfeju2 + " fejű: " + y + " db");
                    System.out.println("Fejek száma: " + fejekSzama);
                    System.out.println("---------------------------");
                }
            }
        }

        // Scanner lezárása
        scanner.close();
    }
}
