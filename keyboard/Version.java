
package keyboard;

public class Version {
    String First = "Theodore";
        String Last = "Moose";
        String Full= First + Last;
    public static void main(String[] args) {
        Version v = new Version();
        v.First = "Ivan";
        v.Last =  " Toledo";
        System.out.println(v.Full);
    }
}

