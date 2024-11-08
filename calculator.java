package test;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		System.out.println("Welcome to ishak's calculator");
		System.out.println("Enter first number");
		Scanner scanner = new Scanner(System.in);
		Double firstNumber = scanner.nextDouble();
		System.out.println("Enter the operator (+ - * /)");
		char operator = scanner.next().charAt(0);
		System.out.println("Enter second number");
		Double secondNumber = scanner.nextDouble();
		switch(operator) {
		case '+':System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		break;
		case '-':System.out.println(firstNumber + '-'+ secondNumber+'='+(firstNumber-secondNumber) );
		break;
		case '*':System.out.println(firstNumber + '*'+ secondNumber+'='+(firstNumber*secondNumber) );
		break;
		case '/':if(secondNumber!=0) {
			System.out.println(firstNumber + '/'+ secondNumber+'='+(firstNumber/secondNumber) );
		}
		else {
			System.out.println("Devision by zero is not allowed");
		}
		break;
		default:System.out.println("Sorry but "+operator+" isn't a valid choice");
		}
	}
}