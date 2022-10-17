import java.util.*;

public class primerNumberChecker {

    // Create a scanner object to get user input
    static Scanner scan = new Scanner(System.in);

    // Create a function to get user input
    static void getUserInput(){

        int userInput = 0;
        
        try {

            System.out.print("Please enter a number to check if it is prime: ");

            // Get user input
            userInput = scan.nextInt();

            
        } catch (Exception e) {
            // Display error message if a number was not given
            System.out.println("Please enter in a number ONLY!");

            // Rerun the getuserInput function
            getUserInput();
        }

        testPrime(userInput);


    }

    // Create a function to check if the number that was given is prime
    static void testPrime(int number){

        int checkNumber = number;

        boolean primeFlag = true;

        for(int x = 1; x < checkNumber; x++){

            if((checkNumber % x) == 0){

                x = checkNumber;

                primeFlag = false;

                checkPrime(primeFlag);

               // System.out.println("No");

            }else{

                primeFlag = true;


            }

        }

        checkPrime(primeFlag);



        // For testing
        //System.out.println(checkNumber);
        
    }

    static void checkPrime(boolean flag){

        if(flag == true){

            System.out.println("The number is prime!");

        }else{

            System.out.println("The number is not prime!");

        }

    }

    // Create our main method so we can run this program
    public static void main(String[] args){

        getUserInput();



    }
    
}
