package for1924;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.set(2007, m - 1, d);
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase());
    }
}
