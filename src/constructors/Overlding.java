package constructors;

public class Overlding {
	
	//overloading constructor:whenever we have more than one constructor in our class 
	//then it is called constructor overloading.
	int a;
	double b;
    String c;
	
	Overlding ()
	{
		a=100; b=45.32 ;  c="ram";
		 System.out.println(a+" "+b+" "+c);
	}
	
	Overlding (int x)
	{
		a=x;
	}
	Overlding (double y,String z)
	{
		b=y;
		c=z;
	}
}

