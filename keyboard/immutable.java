package keyboard;
import java.util.Scanner;
public class immutable {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the string: ");
         String userinput = scanner.nextLine();
               System.out.println("The length of the string is: " + userinput.length());  //FOR LENGTH      
                      System.out.println("Then to uppercase: " + userinput.toUpperCase());      //TO UPPERCASE
                      System.out.println("Then to lowercase: " + userinput.toLowerCase());      //TO LOWERCASE
                            System.out.println(userinput.charAt(0));               // First letter
                            System.out.println(userinput.charAt(userinput.length() - 1));   //LAST LETTER
                                     System.out.println(userinput.substring(1,6));      //2nd character and the 5th string
    }

}
