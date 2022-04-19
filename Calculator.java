import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("This calculator was design by Judit A. Szabo  + to add, - substract, * multiply, 
				/ divide, % see the remains, p expontial  of two numbers");

		Scanner input = new Scanner(System.in);

		System.out.println("Add the first number. Then hit enter. ");

		double a = input.nextDouble();

		System.out.println("Add the second number.Then hit enter. ");
		double b = input.nextDouble();

		System.out.println("Choose the operator:  +, -, *, / , %, p " + ". Then hit enter.");
		char op = input.next().charAt(0);

		input.close();

		switch (op) {

		case '-':
			double result1 = a - b;
			System.out.println("The answer is: " + result1);
			break;

		case '+':

			double result2 = a + b;
			System.out.println("The answer is: " + result2);
			break;

		case '*':
			double result3 = a * b;
			System.out.println("The answer is: " + result3);
			break;

		case '/':
			if (b != 0) {
				double result4 = a / b;
				System.out.println("The answer is: " + result4);

			} else {
				System.out.println("Error");
			}
			break;
		case '%':

			if (a > 0 && b > 0 && b % 1 == 0) {
				double result = a % (int) b;
				System.out.println("The answer is: " + result);

			} else {
				System.out.println("Error");
			}
			break;

		case 'p':

			if (a != 0 && b != 0) {
				double result = Math.pow(a, b);
				System.out.println("The answer is: " + result);

			} else {
				System.out.println("Error");
			}
			break;

		default:
			System.out.println("Error");

		}

	}

}
