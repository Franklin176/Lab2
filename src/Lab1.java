import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("We are going the calculate the area and perimeter of a couple Grand Circus classrooms!");
		
		String run = "Yes";
		while (run.equals("Yes")) {
		
		System.out.println("First enter the length of the room.");
		double num1 = scan.nextDouble();
		System.out.println("Next enter the width.");
		double num2 = scan.nextDouble();
		
		double area = num1 * num2;
		double perim = 2 * (num1 + num2);
		
		System.out.printf("The area of the room is %4.2f " , area );
		System.out.println("");
		System.out.printf("The perimeter of the room is %4.2f " , perim);
		System.out.println("");
		
		
		
		System.out.println("Would you like to keep going? Yes or No?");
		 run = scan.next();
		}
		
		
		if (run.equals ("No")) {
		
		
			System.out.println("Thank you for participating, Have a nice rest of the day.");
			
		}
		
	
		
		
	
			
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
