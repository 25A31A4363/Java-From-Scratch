public class QE{
	public static void main(String[] args){
		float a = 1;
		float b = -5;
		float c = 6;
		
		float D = b*b-4*a*c;
		
		double m = (-b+Math.sqrt(D))/2*a;
		double n = (-b-Math.sqrt(D))/2*a;

		if(D>0){
			System.out.println("One root is: "+m);
			System.out.println("Another one is: "+n);
			System.out.println("Roots are Real and Distinct");
		}else if(D==0){
			System.out.println("One root is: "+m);
			System.out.println("Another one is: "+n);
			System.out.println("Roots are Real and Equal");
		}else{
			System.out.println("Roots are Imaginary");
		}
	}
}