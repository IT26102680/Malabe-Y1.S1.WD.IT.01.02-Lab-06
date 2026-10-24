import java.util.Scanner;

public class IT26102680Lab6Q3 { 
   public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
       int count = 0;
       double sumOfSquares = 0;
    
    System.out.println("Enter positive integers (terminate input with -99):");
    
    while (true) {
        System.out.print("Enter a number: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            
            if (number == -99) {
                break;
            }
            
            
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
                continue;
            }
            
            
            sumOfSquares += Math.pow(number, 2);
            count++;
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); 
        }
    }
    
    
    if (count > 0) {
        double rms = Math.sqrt(sumOfSquares / count);
        System.out.println("The Root Mean Square (RMS) is : " + rms);
    } else {
        System.out.println("No valid numbers were entered.");
    }
    
    scanner.close();
}
}
