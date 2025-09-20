package Activits;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers seperated by space:");
        int nm1 = sc.nextInt();
        int nm2 = sc.nextInt();
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.plus(nm1, nm2));
        System.out.println("Difference: " + calc.minus(nm1, nm2));
        System.out.println("Product: " + calc.times(nm1, nm2));
        System.out.println("Quotient: " + calc.hatiin(nm1, nm2));
        sc.close();
    }
 }
 // 4 basic arithmetic method
 class Calculator {
    int plus(int a, int b) {
        return a + b;
    }
    int minus(int a, int b) {
        return a - b;
    }
    int times(int a, int b) {
        return a * b;
    }
    int hatiin(int a, int b) {
        return a / b;
    }

}