package basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            String stars = "";
            for (int j = 0; j < cnt - i; j++) {
                stars += "*";
            }
            System.out.println(String.format("%" + cnt + "s", stars));
        }
    }
}
