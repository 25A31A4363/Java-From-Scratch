import java.util.Scanner;
class Arithmetic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a,b;

		System.out.println("Enter first Number:");
		a = sc.nextInt();

		System.out.println("Enter second Number:");
		b = sc.nextInt();

		System.out.println("Addition= "+(a+b));
		System.out.println("Subtraction= "+(a-b));
		System.out.println("Multiplication= "+(a*b));
		System.out.println("Division= "+(a/b));
	}
}
