class DefaultValues{

//Instance Variables

byte b;
short s;
int i;
long l;
float f;
double d;
char c;
boolean bool;

public static void main(String[] args){
	DefaultValues obj = new DefaultValues();
		
	System.out.println("Default Value of byte is: "+obj.b);
	System.out.println("Default Value of short is: "+obj.s);
	System.out.println("Default Value of int is: "+obj.i);
	System.out.println("Default Value of long is: "+obj.l);
	System.out.println("Default Value of float is: "+obj.f);
	System.out.println("Default Value of double is: "+obj.d);
	System.out.println("Default Value of char is: ["+obj.c+"]");
	System.out.println("Default Value of boolean is: "+obj.bool);
    }
}

		