package q1718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cipher = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        char[] plain = sc.nextLine().toCharArray();
        char[] key = sc.nextLine().toCharArray();
        int j = 0;
        for (int i = 0; i < plain.length; i++, j++) {
            if (j == key.length) j = 0;
            if (plain[i] == 32) {
                System.out.print(" ");
                continue;
            }
            int pos = ((int) plain[i] - 96) - ((int) key[j] - 96);
            pos = pos < 0 ? pos += 26 : pos;
            System.out.print(cipher[pos - 1 < 0 ? cipher.length - pos - 1 : pos - 1]);
        }
    }
}
