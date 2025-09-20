

public class ExceptionLesson {
}
class Exception2 {
    public static void main(String[] args) {
        try {
            args[1] = "Hello Panget";
            System.out.println(args[0]);
            
        }
        catch (ArrayIndexOutOfBoundsException e )
       {
            System.out.println("No argument");
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Done");
    }
   
}