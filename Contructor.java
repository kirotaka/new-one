public class Contructor {
    public static void main(String[] args) {
        Bunny bunny1 = new Bunny("Vanie", "black");
        Bunny bunny2 = new Bunny("Notvanie", "blue");
        System.out.println("The first ever bunny is called " + bunny1.name);
        System.out.println("The first ever bunny is called " + bunny2.name);
    }
}

class Bunny {
      String name;
      String color;
    public Bunny(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("I created a bunny comrade");
    }
}