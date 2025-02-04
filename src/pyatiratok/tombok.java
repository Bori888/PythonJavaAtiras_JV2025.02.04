
package pyatiratok;

import java.util.Random;

public class tombok {
    public static void main(String[] args) {
        final int HOSSZ =10;
        int[] tomb = new int[HOSSZ];  
        Random random = new Random();

        for (int i = 0; i < HOSSZ; i++) {
            if (i % 2 == 0) {
                tomb[i] = 1;  
            } else {
                tomb[i] = random.nextInt(100001);  
            }
        }

        // A lista kiírása
        for (int i = 0; i < HOSSZ; i++) {
            System.out.println(i + " = " + tomb[i]); 
            
            
       }
        
        
    }
    
    
}
