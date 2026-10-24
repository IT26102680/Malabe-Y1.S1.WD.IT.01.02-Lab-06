import java.util.Scanner;

public class IT26102680Lab6Q2B{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
		
		int[] numbers=new int[10];
		int i=1;
		while(i<10){
			System.out.print("Enter number"+i+":");
			numbers[i-1]=scanner.nextInt();
			i++;
			
		}
		
		System.out.println("\nThe numbers you enter are:");
		i=1;
		while(i<=10){
			System.out.print(numbers[i-1]+"");
			i++;
		}
		System.out.println();
		
		scanner.close();
	}
}