import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		boolean r = true;
		while (r==true){
		System.out.println("Choose a number-I will come to your house and eliminate you if you enter something else");
		Scanner query = new Scanner(System.in);
		int num1 = query.nextInt();
		System.out.println("choose an operation between +.-,x,/");
		String operation = query.next();
		System.out.println("Choose another number- I will come to your house and eliminate you if you enter something else");
		int num2 = query.nextInt();
		if (operation.equals("x")) {
			System.out.println(num1 * num2);
		}
		else if (operation.equals("/")) {
			System.out.println(num1 / num2);
		}
		else if (operation.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (operation.equals("-")) {
			System.out.println(num1 - num2);
		}
		else {
			System.out.println("You entered in an invalid operation, please restart!");
		System.out.println("do you want to continue? type y or n to confirm");
		}
		}
		// TODO Auto-generated method stub

	}

}

