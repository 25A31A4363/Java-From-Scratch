class MathDemo{
	public static void main(String args[]){

	System.out.println(Math.max(5,10));

	System.out.println(Math.min(5,10));
	
	System.out.println(Math.sqrt(49));
		
	System.out.println(Math.abs(-5.7));

	System.out.println(Math.pow(8,2));
	
	System.out.println(Math.round(6.6));

	System.out.println(Math.ceil(4.2));
	
	System.out.println(Math.floor(4.9));

	System.out.println(Math.random());

	int randomNum = (int)(Math.random()*101);  // 0 to 100
	System.out.println(randomNum);
	}
}