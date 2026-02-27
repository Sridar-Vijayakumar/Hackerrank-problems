import java.util.*;

public class pandigita {

    public static boolean isPandigital(String number) {

        // Starting digit cannot be 0
        if (number.charAt(0) == '0') {
            return false;
        }

        // Array to track digits 0-9
        boolean[] digits = new boolean[10];

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (Character.isDigit(ch)) {
                digits[ch - '0'] = true;
            }
        }

        // Check if all digits 0-9 exist
        for (int i = 0; i < 10; i++) {
            if (!digits[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        if (isPandigital(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}