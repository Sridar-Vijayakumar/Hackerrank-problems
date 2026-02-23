import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;

            for (int i = 0; i < n; i++) {
                sum += power * b;
                System.out.print(sum + " ");
                power *= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}



