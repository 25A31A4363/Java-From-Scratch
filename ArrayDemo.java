import java.util.Scanner;
class ArrayDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Size of Array:");
		n = sc.nextInt();
	
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}