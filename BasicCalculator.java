import java.util.*;
class BasicCalculator {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double number1,number2,result;
	int method;
	System.out.println("---Basic--Calculator---");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");

	System.out.println("Enter First Number : ");
	number1 = sc.nextDouble();
	System.out.println("Enter Second Number : ");
	number2 = sc.nextDouble();
	System.out.println("Enter The Number Of Method : ");
	method = sc.nextInt();

	if (method==1) {
		result = number1 + number2;
		System.out.println("Result : " + result);
		}
	else if (method==2) {
		result = number1 - number2;
		System.out.println("Result : " + result);
		}
	else if (method==3) {
		result = number1 * number2;
		System.out.println("Result : " + result);
		}
	else if (method==4) {
		if (number2==0) {
			System.out.println("Error : Division by Zero is not possible");
			}
		else {
		result = number1 / number2;
		System.out.println("Result : " + result);
			}
		}
	else {
		System.out.println("Error : No Method ");
		}
	sc.close();
	}
}