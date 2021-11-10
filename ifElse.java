package ifElse;
import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num1;
		
		System.out.println("Enter your Grade :");
		num1=input.nextInt();
		

		if (num1>=98) {
			System.out.println("Excelent");
		}
		else if(num1>=95) {
			System.out.println("Superior");
		}
		else if(num1>=92) {
			System.out.println("Very Good");
		}
		else if(num1>=89) {
			System.out.println("Good");
		}
			else if(num1>=86) {
				System.out.println("Very Satisfactory");
		}
			else if(num1>=83) {
				System.out.println("Satisfactory");
		}
			else if(num1>=80) {
				System.out.println("Average");
			
		}
			else if(num1>=77) {
			System.out.println("Fair");
			
		}
			else if(num1>=75) {
		System.out.println("Passed");
		}
			else if(num1<=75) {
				System.out.println("Fail");
		}
			
		
		

	}

}
