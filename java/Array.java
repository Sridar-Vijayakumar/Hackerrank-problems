import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[6][6];

        // Read 6x6 matrix
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        // There are 16 hourglasses in a 6x6 array
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int hourglassSum =
                        arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        System.out.println(maxSum);
        sc.close();
    }
}