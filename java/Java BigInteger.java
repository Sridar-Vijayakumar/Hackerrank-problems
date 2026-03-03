import java.math.BigInteger;
import java.util.Scanner;

public class Solution git {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read large numbers as BigInteger
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        // Perform addition and multiplication
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        // Print results
        System.out.println(sum);
        System.out.println(product);

        sc.close();
    }
}
