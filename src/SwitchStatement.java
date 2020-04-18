import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int choice;
		int num1;
		int num2;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("1. Add 2 numbers");
		System.out.println("2. Substract 2 numbers");
		System.out.println("3. Get the square of a number");
		choice=input.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter 2 numbers");
			num1=input.nextInt();
			num2=input.nextInt(); 
			System.out.println("The total of the 2 numbers is "+(num1+num2));
		break;
		case 2:
			System.out.println("Enter 2 numbers");
			num1=input.nextInt();
			num2=input.nextInt(); 
			System.out.println("The susbstraction of the 2 numbers is "+(num1-num2));
		break;
		case 3:
			System.out.println("Enter 1 number");
			num1=input.nextInt(); 
			System.out.println("The total of the 2 numbers is "+(num1*num1));
		break;
		default:
			System.out.println("Please select a choice from the menu");
			System.out.println("1. Add 2 numbers");
			System.out.println("2. Substract 2 numbers");
			System.out.println("3. Get the square of a number");
		
		}
		
	}

}
