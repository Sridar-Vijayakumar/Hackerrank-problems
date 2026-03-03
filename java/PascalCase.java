import java.util.Scanner;

public class PascalCase{

    public static String toPascalCase(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(
                    word.substring(0,1).toUpperCase() +
                    word.substring(1).toLowerCase()
                );
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String output = toPascalCase(input);

        System.out.println("PascalCase: " + output);
    }
}