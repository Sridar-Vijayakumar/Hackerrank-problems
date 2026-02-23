import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine(); 
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(text.substring(start, end));

        sc.close();
    }
}
