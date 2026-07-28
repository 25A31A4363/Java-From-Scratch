import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Enter a Number:");
		N = sc.nextInt();
		
		if(N%2 == 0){
		   System.out.println("Even Number");
		}else{
		   System.out.println("Odd Number");
		}
	}
}