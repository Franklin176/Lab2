import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// this is a single line comment
		
		/*
		 * this is a block comment, used for multiple lines, useful for generating own java documentation
		 */
		
		System.out.print("Hi!");
		System.out.println(" My name is Tee");
		System.out.print("Hey Again!");
		
		// create a Scanner object to consume input 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name: ");
		String fullName = scan.nextLine(); 
		System.out.println(fullName);
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println(age);
		
		// adding a garbage line to clean out the scanner 
		// you will need to do this when you are going from scanning a number to 
		// a nextLine();
		
		scan.nextLine();
		
		System.out.println("Enter your address: ");
		String address = scan.nextLine();
		System.out.println(address);
		
		char a; // declaring a variable
		a = 'A'; // initializing a variable
		
		
		// one line declaring and initializing
		boolean test = true;
		
		// this is a constant, once created it cant be changed 
		// because of the final keyword, usually a best practice to use all CAPS for the naming
		// identifier
		
		final String COMPANYNAME = "Grand Circus";
		//COMPANYNAME = "Park"; -- this cant be done
		
		final int ROOM_NUMBER = 445;
		
		// primitive data types -- they are stored in the stack memory and have an assigned value 
		byte b = 127;
		short s = 128; 
		int i = 128;
		int max = Integer.MAX_VALUE;
		System.out.println("Integer MAX =" + max);
		long l = 87987977979797L; // L need to be specified if the number assigned is smaller than the 
		// MAX.SIZE of an int
		
		float f = (float)67.8; // can use lowercase f or Capital F as well
		double d = 67.8;
		char c = '@';
		boolean bool = true; // Either true or false, no quotes needed
		
		Integer num = null; 
		System.out.println(num);
		
		int remainder = 9 % 5;
		System.out.println(remainder);
		
		int num2 = 6;
		num2++;
		System.out.println(num2++);
		
		int example = 3;
		//example++;
		//example = example + 1;
		//example += 1;
		System.out.println(example);
		
		int negativeNum = -56; 
		// demonstrating that you can assign negative values
		
		// add post increment example back in
		
		// implicit casting example
		// when going from a less precise type to a more precise type Java does it automatically
		int price = 3;
		double rightPrice = price;
		System.out.println(rightPrice);
		
		// explicit casting 
		// when we go from a more precise data type to a less precise data type
		// we have to let java know we know what we're doing
		
		double total = 99.78;
		int newTotal = (int)total; // truncating (removing) the decimal places
		System.out.println(newTotal);
		
		scan.close();
		
	}
}
