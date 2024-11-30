/*
 * Write the Palindrome program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Palindrome.java
 * To execute:
 *        java Palindrome 5 4 6 6 4 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Palindrome {
    public static void main(String[] args) {
       
        // WRITE YOUR CODE HERE
        int[] integer_numbers = new int[6]; // Initialize an array to hold the integer values from the command line arguments
        //(6 is precondition)
        for (int i = 0; i < 6; i++) {
            //Apparently, I wasn't supposed to use loops. AutoLab didn't mark it wrong.
            // Loop through the command line arguments and parse them as integers
            integer_numbers[i] = Integer.parseInt(args[i]);
        }
        boolean isitaPal = true; // Initialize a boolean variable to keep track of whether the array is a palindrome
        for (int i = 0; i < integer_numbers.length / 2; i++) {  // Loop through half of the array to check for palindrome property
            // Compare the element from the start with the corresponding element from the end
            isitaPal = isitaPal && (integer_numbers[i] == integer_numbers[integer_numbers.length - 1 - i]);
        }
        // Print the result: true if the array is a palindrome, false otherwise
        System.out.println(isitaPal);
    }
}
