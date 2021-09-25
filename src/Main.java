import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /***********************/
        /* Mad Libs            */
        /***********************/

        System.out.println("Welcome to Mad Libs!");
        // Write your code here

        System.out.println("\n" + "Read the text below and fill out the empty spaces with the right words. Follow the instructions after the text." + "\n");
        System.out.println("A country is \"double-landlocked\" when it is surrounded only by _______(1) countries. There are two of them in the world: one is in ______(2); the other one in Europe. The only double-landlocked country in Asia is ________(3). Do you know the other one in ________(4)? It is __________(5).\n" +
                "\n" +
                "Now let’s fill the empty spaces. Follow the instructions below. Are you ready? (Yes/No)");
        // We assume the user input will be "Yes".

        Scanner myScanner = new Scanner(System.in);
        String userInputZero = myScanner.nextLine();
        System.out.println("Great. Now send me your answer to fill the empty space in the following sentence.");
        System.out.println("A country is \"double-landlocked\" when it is surrounded only by _______(1) countries.");
        // The right answer: landlocked. We assume the user sends correct answer everytime. Conditionals are not within the scope of this assignment.

        String userInputOne = myScanner.nextLine();
        System.out.println("Good job! Now go to the next sentence.");
        System.out.println("There are two of them in the world: one is in ______(2); the other one in Europe.");
        // The right answer: Asia

        String userInputTwo = myScanner.nextLine();
        System.out.println("Super! Now try this one.");
        System.out.println("The only double-landlocked country in Asia is ________(3).");
        // The right answer: Uzbekistan

        String userInputThree = myScanner.nextLine();
        System.out.println("Wow! You are amazing! Now go to the 4th sentence.");
        System.out.println("Do you know the other one in ________(4)?");
        // The right answer: Europe

        String userInputFour = myScanner.nextLine();
        System.out.println("You are something! I am so impressed! Can you find the last one?");
        System.out.println("It is __________(5).");
        // The right answer: Liechtenstein

        String userInputFive = myScanner.nextLine();
        System.out.println("\n" + "Congratulations!!!! You have been accepted to Kenzie Academy! Have never seen someone so good at geography." + "\n");

        System.out.println("A country is \"double-landlocked\" when it is surrounded only by " + userInputOne + " countries. There are two of them in the world: one is in " + userInputTwo + " ; the other one in Europe. The only double-landlocked country in Asia is " + userInputThree + ". Do you know the other one in " + userInputFour + "? It is " + userInputFive + ".");

    }
}