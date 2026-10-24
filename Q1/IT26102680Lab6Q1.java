import java.util.Scanner;

public class IT26102680Lab6Q1{
	public static void main(String[] args){
		Scanne scanner=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		double new=scnner.nextDouble();
		
		double squre=number*number;
		double squreRoot=Math.sqrt(number);
		
		System.out.println("The squre of"+number+"is:"squre);
		System.out.println("The squre root of"+number+"is:"+squreRoot);
		
		scanner.close();
	}
}