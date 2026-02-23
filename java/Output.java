
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();

            // %-15s  -> left-align string in 15 characters
            // %03d   -> pad integer with leading zeros (3 digits)
            System.out.printf("%-15s%03d%n", s, x);
        }

        System.out.println("================================");

        sc.close();
    }
}
