package Activits;

public class Task8 {
    // Write a program featuring an integer variable arguments method. 
    //The method should return the sum of all parameters and, for each parameter, the cumulative sum up to that point. 
    //For instance, given parameters (4, 5, 10), the program should compute the total for the first parameter, 
    //such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
    public static void main(String[] args) {
        cSum(3, 6, 10);
    }
    public static int cSum(int... numbers) {
        int tSum = 0;
        for (int number : numbers) {
            int cumulative = 0;
            for (int i = 1; i <= number; i++) {
                cumulative += i;
            }
            System.out.println("Cumulative sum of " + number + " is: " + cumulative);
            tSum += cumulative;
        }
        return tSum;
    }
}
