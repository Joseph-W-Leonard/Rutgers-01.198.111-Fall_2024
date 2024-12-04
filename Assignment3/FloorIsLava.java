
/*************************************************************************
 *  Compilation:  javac FloorIsLava.java
 *  Execution:    java FloorIsLava n
 *
 *  @author Shane Haughton, Maaz Mansuri
 *
 **************************************************************************/

 public class FloorIsLava {

    public static void main (String[] args ) {
    
        // Parse the input number from the command line argument
        int num = Integer.parseInt(args[0]); 
        
        // Loop to print all even numbers from 2 up to and including the input number
        for (int i = 2; i <= num; i+=2) { 
            System.out.println(i); // Print the current even number
        }
        
        // Check if the input number is odd
        if (num % 2 != 0) {
            // If the number is odd, loop to print all odd numbers from the input number down to 1
            for (int i = num; i > 0; i-=2) { 
                System.out.println(i); // Print the current odd number
            }
        }
        else {
            // If the number is even, loop to print all odd numbers from one less than the input number down to 1
            for (int i = num-1; i > 0; i-=2) {
                System.out.println(i); // Print the current odd number
            }
        }
    }
}
