package keyboard;

public class Version1 {
   
        
        String FirstName = "Theodore ";
        String LastName = "Moose";
        String Fullname = FirstName + LastName;
         public static void main(String[] args) {
         Version1 v = new Version1();
         v.FirstName = "Vincent";
         v.LastName = " Piol";
        System.out.println(v.Fullname);
    }
}
