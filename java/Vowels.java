import java.util.Scanner;

public class Vowels {

    public static String repeatVowels(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            result.append(ch);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                result.append(ch); 
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String output = repeatVowels(str);

        System.out.println(output);
    }
}

