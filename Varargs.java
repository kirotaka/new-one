public class Varargs {

    public static int addNumbers(int y, int x, int... z) {
        int sum = y + x;
        for (int num : z) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = addNumbers(1, 2, 3, 4, 5);
        System.out.println("Sum: " + result);
    }

}