package Number_Reversal;
import java.util.*;

public class numberReversal {

    // Create a Scanner object to get user input
    static Scanner scan = new Scanner(System.in);


    // Create a class to generate a number to reverse
    static int number(){

        // Create a variable for the number given by the user
        int number;

        // Prompt the user to enter a number into the system to reverse
        System.out.println("Please enter a number to reverse: ");

        // Get the number from the user
        number = scan.nextInt();

        // Return the number so we can use it in other functions
        return number;

    }

    // Create a class to reverse the number
    static String reverseWord(){

        // Get the word that was given in the number function
        int number = number();

        // Convert the integer to a string to get the length
        int length = String.valueOf(number).length();

        // Conver the number to a string
        String numberToString = String.valueOf(number);

        // This will hold the new word that is reversed
        String newWord = "";

        // Reverse the word and create a new integer
        for(int x = length - 1; x >= 0; x--){

            // Add the character to the new word, starting at the end of the numberToString word
            // Ex. numberToString = 123, it will add 3 to the new word, then 2, then 1. Making the new word 321
            newWord = newWord + numberToString.charAt(x);

        }

        // Return the reversed word so we can use it in other functions
        return newWord;

    }

    // Create our main method
    public static void main(String[] args){

        // Create a word variable and assign it to the newWord that was returned in the reverseWord function
        String word = reverseWord();

        // Print out the reversed word
        System.out.println(word);

    }
    
}
