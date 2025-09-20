package Activits;

public class Task3 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = b;
        String d = c;
        boolean bl = a == b;
        boolean b2 = d.equals(b);
        boolean b3 = !c.equals(a);
        boolean b2_fixed = d.equals(b + "");
        boolean b3_fixed = !c.equals(a + "!");
        if (bl && b2_fixed && b3_fixed) {
            System.out.println("Success!");
        }
    }
}
