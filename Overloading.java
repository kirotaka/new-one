public class Overloading {
    public boolean shit () {
        return false;
    }
    public void shit (int cm, short meter) {
        System.out.println("cm");
    }
    public void shit (long dump) {
        System.out.println("dump");
    }
    public void shit (short dump1) {
        System.out.println("dump1");
    }
    public void shit (short meter, int cm) throws Exception {

    }
    public static void main(String[] args) {
        Overloading ol = new Overloading();
        long dum = 1L;
      
        ol.shit(10);
        ol.shit(dum);
        try {
            ol.shit((short)10, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
