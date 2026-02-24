public class LargestSwap {

    public static int largestBySwapping(int num) {

        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;

        int maxNum = num;

        // Try swapping every pair of digits
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                // Swap digits
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;

                // Convert to number
                int newNum = Integer.parseInt(new String(digits));

                // Update max
                if (newNum > maxNum) {
                    maxNum = newNum;
                }

                // Swap back
                temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {

        int num = 2736;
        int result = largestBySwapping(num);

        System.out.println("Largest number after swap: " + result);
    }
}