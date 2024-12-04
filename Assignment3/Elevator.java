
/*************************************************************************
 *  Compilation:  javac Elevator.java
 *  Execution:    java Elevator 'number of floors' 'floor requests' 'number of restricted floors' 'optional passcode'
 *
 *  @author Pooja Kedia
 *  @author Vidushi Jindal
 *
 *************************************************************************/
public class Elevator {
    
    public static void main ( String[] args ) {

        // WRITE YOUR CODE HERE
        // Parse the number of floors in the building from the first command line argument
        int numberOfFloors = Integer.parseInt(args[0]);

        // Parse the floor requests from the second command line argument
        int floorRequests = Integer.parseInt(args[1]);

        // Parse the number of restricted floors from the third command line argument
        int restrictedFloors = Integer.parseInt(args[2]);

        // Parse the optional passcode from the fourth command line argument, if provided; otherwise, set it to -42
        int passcode = args.length > 3 ? Integer.parseInt(args[3]) : -42; // 42 is the answer to life, the universe, and everything.
        
        // Initialize the starting positions of the two elevators to the first floor
        int elevator1 = 1;
        int elevator2 = 1;

        // Process each floor request until there are no more requests
        while (floorRequests > 0) {
            // Extract the last digit of the floorRequests to get the current requested floor 
            int requestedFloor = floorRequests % 10;

            // Remove the last digit from floorRequests
            floorRequests /= 10;
            
            // Determine which elevator is closer to the requested floor
            if (Math.abs(elevator1 - requestedFloor) <= Math.abs(elevator2 - requestedFloor)) { 
                // If elevator1 is closer or equally close, assign the request to elevator1
                System.out.println("1 " + requestedFloor); 
                elevator1 = requestedFloor; // Move elevator1 to the requested floor
            } 
            
            else {
                // If elevator2 is closer, assign the request to elevator2
                System.out.println("2 " + requestedFloor);
                elevator2 = requestedFloor; // Move elevator2 to the requested floor
            }
            
            // Check if the requested floor is a restricted floor
            if (requestedFloor > numberOfFloors - restrictedFloors) { 
                // If the passcode is not provided or invalid for the requested floor, deny access
                if (passcode == -42 || (passcode % numberOfFloors != requestedFloor && (passcode % numberOfFloors != 0 || requestedFloor != numberOfFloors))) {
                    System.out.println("Denied");
                }   
                else {
                    // If the passcode is valid for the requested floor, grant access
                    System.out.println("Granted");
                }
            }
        }
    } 
}
