import java.util.Objects;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        //user input for name
    Scanner nameScanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = nameScanner.nextLine();

    //conditionals for Alice or Bob
    if (name.equals("Alice") || name.equals("Bob")){
        System.out.println("Hello, " + name + "!");
    }else {
        System.out.println("You are neither Alice nor Bob.");
    }
    }
}
