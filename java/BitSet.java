import java.util.Scanner;

public class BitSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        java.util.BitSet b1 = new java.util.BitSet(n);
        java.util.BitSet b2 = new java.util.BitSet(n);

        for (int i = 0; i < m; i++) {

            String operation = sc.next();
            int setNumber = sc.nextInt();
            int value = sc.nextInt();

            java.util.BitSet first = (setNumber == 1) ? b1 : b2;
            java.util.BitSet second = (value == 1) ? b1 : b2;

            switch (operation) {

                case "AND":
                    first.and(second);
                    break;

                case "OR":
                    first.or(second);
                    break;

                case "XOR":
                    first.xor(second);
                    break;

                case "FLIP":
                    first.flip(value);
                    break;

                case "SET":
                    first.set(value);
                    break;
            }

            System.out.println(
                b1.cardinality() + " " + b2.cardinality()
            );
        }

        sc.close();
    }
}
