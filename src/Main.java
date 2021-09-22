import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /***********************/
        /* Mad Libs            */
        /***********************/

        System.out.println("Welcome to Mad Libs!");

        // Write your code here

        System.out.println("Read the text below and fill out the empty spaces with the right words. Follow the instructions after the text." + "\n");
        System.out.println("A country is \"double-landlocked\" when it is surrounded only by _______(1) countries. There are two of them in the world: one is in ______(2); the other one in Europe. The only double-landlocked country in Asia is ________(3). Do you know the other one in ________(4)? It is __________(5).\n" +
                "\n" +
                "Now let’s fill the empty spaces. Follow the instructions below. Are you ready? (Yes/No)\n");
        // We assume the user input will be "Yes".

        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.nextLine();
        System.out.println("Great. Now send me your answer to fill the empty space in the following sentence." +
                "\n" +
                "A country is \"double-landlocked\" when it is surrounded only by _______(1) countries.\n");
                // The right answer: landlocked. We assume the user sends correct answer everytime because I do not know how to use conditionals yet. :)

        myScanner = new Scanner(System.in);
        userInput = myScanner.nextLine();
        System.out.println("Good job! Now go to the next sentence." + "\n" + "There are two of them in the world: one is in ______(2); the other one in Europe.");
        // The right answer: Asia

        myScanner = new Scanner(System.in);
        userInput = myScanner.nextLine();
        System.out.println("Super! Now try this one.\n" +
                "The only double-landlocked country in Asia is ________(3).\n");
        // The right answer: Uzbekistan

        myScanner = new Scanner(System.in);
        userInput = myScanner.nextLine();
        System.out.println("Wow! You are amazing! Now go to the 4th sentence.\n" +
                "Do you know the other one in ________(4)? ");
        // The right answer: Europe

        myScanner = new Scanner(System.in);
        userInput = myScanner.nextLine();
        System.out.println("You are something! I am so impressed! Can you find the last one?\n" +
                "It is __________(5).");
        // The right answer: Liechtenstein

        myScanner = new Scanner(System.in);
        userInput = myScanner.nextLine();
        System.out.println("Congratulations!!!! You have been accepted to Kenzie Academy! Have never seen someone so good at geography.");
    }
}
