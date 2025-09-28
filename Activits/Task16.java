package Activits;
import java.util.Scanner;
import java.util.Random;
//Create a gorilla class which implements the Animal interface.
//Add this comment inside appropriate methods:
//// lather, rinse, repeat
//// pet at your own risk
//// put gorilla food into cage
//interface Animal [
//boolean feed(boolean timeToEat);
//void groom();
//void pet();
//}
public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
        gorilla.secret();
    }
}

interface Animal {
    boolean feed (boolean timeToEat);
    void groom();
    void pet();
    void secret();
}

//Create a gorilla class which implements the Animal interface.
//Add this comment inside appropriate methods:
// lather, rinse, repeat
// pet at your own risk
// put gorilla food into cage

class Gorilla implements Animal {
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();

    public boolean feed (boolean timeToEat) {
        System.out.println("put gorilla food into cage or die!");
        return true;
    }

    public void  groom () {
        System.out.println("lather, rinse, repeat");
    }

    public void  pet () {
        System.out.println("pet at your own risk");
    }
    public void secret() {
        int rNumber, iNumber;
        rNumber = random.nextInt(3) + 1; // random number between 1 and 3
        String input;
        int number = -1;
        boolean valid = false;
        // Door ASCII art arrays
        String[] door1 = {
            "-----------------------------------",
            "⠀⠀⠀⠀⠀⠀⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿DOOR⣿⣿1⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⡿⠋⣉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣇⠘⠿⠃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀"
        };
        String[] door2 = {
            "-----------------------------------",
            "⠀⠀⠀⠀⠀⠀⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿DOOR⣿⣿2⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⡿⠋⣉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣇⠘⠿⠃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀",
            ""
        };
        String[] door3 = {
            "-----------------------------------",
            "⠀⠀⠀⠀⠀⠀⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿DOOR⣿⣿3⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⡿⠋⣉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣇⠘⠿⠃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀",
            "⠀⠀⠀⠀⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⠀⠀⠀⠀",
            "⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀",
            ""
        };
        // Print all doors side by side before input
        for (int i = 0; i < door1.length; i++) {
            System.out.println(door1[i] + "    " + door2[i] + "    " + door3[i]);
        }
        do {
            System.out.print("Enter a number to enter a door (1, 2, or 3): ");
            input = scanner.nextLine();
            if (input.matches("[1-3]")) {
                number = Integer.parseInt(input);
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter only 1, 2, or 3.");
            }
        } while (!valid);
        iNumber = number;
        System.out.println("You chose door: " + iNumber);
        if (iNumber == rNumber) {
            System.out.println("You entered a room with 100 Gorillas fight or die!");
        } else {
            System.out.println("You wake up from a dream");
        }
        // Print only the selected door
        System.out.println();
        String[] selectedDoor = (iNumber == 1) ? door1 : (iNumber == 2) ? door2 : door3;
        for (String line : selectedDoor) {
            System.out.println(line);
        }
    }

}
