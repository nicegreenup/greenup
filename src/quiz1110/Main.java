package quiz1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main m = new Main();
        int r = m.fn(String.format("%02d", n));
        int c = 1;
        while (n != r) {
            c++;
            r = m.fn(String.format("%02d", r));
        }
        System.out.println(c);
    }

    private int fn(String c) {
        char[] ca = c.toCharArray();
        return (ca[1] - 48) % 10 * 10 + (ca[0] + ca[1] - 96) % 10;
    }

}
