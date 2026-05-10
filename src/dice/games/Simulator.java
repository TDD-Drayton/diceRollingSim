package dice.games;

//to generate random numbers - package
import java.util.Random;

//to get user input - package
import java.util.Scanner;


public class Simulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("How many dice would you like to roll " + name +"?");
        int numberOfDice = scanner.nextInt();

//number generation
        Random rand = new Random();
        int rolledNumber = rand.nextInt(6) + 1;
        System.out.println(display(rolledNumber));
    }

// strings to display the die faces
    static String display(int value){
        switch(value) {
            case 1: return "-------\n|     |\n|  o  |\n|     |\n-------";
            case 2: return "-------\n| o   |\n|     |\n|   o |\n-------";
            case 3: return "-------\n| o   |\n|  o  |\n|   o |\n-------";
            case 4: return "-------\n| o o |\n|     |\n| o o |\n-------";
            case 5: return "-------\n| o o |\n|  o  |\n| o o |\n-------";
            case 6: return "-------\n| o o |\n| o o |\n| o o |\n-------";
            default: return "error f";
        }

    }
}

