package quiz10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int a = sc.nextInt();
            if (a < d) System.out.print(a + " ");
        }
    }
}
