package Activits;
import static java.lang.Math.*;

public class Task9 {

    
  public static int add(int a, int b) {
  return addExact(a, b);
}
  public static int subtract(int a, int b) {
  return subtractExact(a, b);
}
  public static int multiply(int a, int b) {
    return multiplyExact(a, b);
}
  public static int divide(int a, int b) {
    return floorDiv(a, b);
}
   public static void main(String[] args) {
       System.out.println("Addition: " + add(19, 50));
       System.out.println("Subtraction: " + subtract(80, 29));
       System.out.println("Multiplication: " + multiply(5, 12));
       System.out.println("Division: " + divide(150, 3));
   }
}