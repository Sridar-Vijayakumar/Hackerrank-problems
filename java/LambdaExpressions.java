    import java.util.*;

public class LambdaExpressions {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int type = sc.nextInt();
            int num = sc.nextInt();

            if (type == 1) {
                if (num % 2 == 0)
                    System.out.println("EVEN");
                else
                    System.out.println("ODD");
            }

            else if (type == 2) {
                if (isPrime(num))
                    System.out.println("PRIME");
                else
                    System.out.println("COMPOSITE");
            }

            else if (type == 3) {
                if (isPalindrome(num))
                    System.out.println("PALINDROME");
                else
                    System.out.println("NOT PALINDROME");
            }
        }

        sc.close();
    }
}

