import java.util.Scanner;

public class testforpalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String InputStr = scanner.nextLine();
        String reversed = new StringBuilder(InputStr).reverse().toString();
        if (InputStr.equalsIgnoreCase(reversed)) {
            System.out.println("The input string is a palindrome");
        } else {
            System.out.println("The input string is not a a palindrome");
        }
        scanner.close(); // Close the scanner here
    }
}
