package RandomTable;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] tab = new int[5];
        Random rand = new Random();
        for (int x = 0; x < tab.length; x++) {

            int n = rand.nextInt(100) + 0;
            if (n < 50) {
                System.out.println("random wynosi: " + n);
                tab[x] = 10;

                System.out.println("random wyszedl poniżej 50, więc x: " + tab[x]);
                System.out.println();
            } else if (n > 50) {
                System.out.println("random wynosi: " + n);
                tab[x] = 20;
                System.out.println("random wyszedł powyżej 50,więc x: " + tab[x]);
                System.out.println();
            }

        }
    }
}
