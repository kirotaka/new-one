package Activits;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int nm1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int nm2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int nm3 = sc.nextInt();

        if (nm1 == nm2 && nm2 == nm3) {
            System.out.println("All numbers are equal");
        } else if (nm1 >= nm2 && nm1 >= nm3) {
            System.out.println("The largest number is: " + nm1);
        } else if (nm2 >= nm1 && nm2 >= nm3) {
            System.out.println("The largest number is: " + nm2);
        } else {
            System.out.println("The largest number is: " + nm3);
        }

        sc.close();

    }
}