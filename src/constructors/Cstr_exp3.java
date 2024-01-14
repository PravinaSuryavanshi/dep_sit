package constructors;

public class Cstr_exp3 
{
	
	int a;
	int b;
	int c;
	
	public Cstr_exp3()  //user defined without parameter /zero parameter/default constructor
	
	{
		a=5;
		b=2;
		c=88;
	}
	
	public Cstr_exp3(int a)  //user defined single parameter constructor
	//when we create parameterize constructor so we have to also create defual constructor or 
	//zero parameteriz constructor why 
	{
		//this();
		//a=x;
		//b?
		//c?
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}
	
	/*public  Cstr_exp3(int x, int y,int z)  //user defined two parameter constructor
	
	{
		//this(y);
		a=x;
		b=y;
		c=z;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}*/
		

	public static void main(String[] args) 
	
	{
		
	//Cstr_exp3 obj = new Cstr_exp3();
	Cstr_exp3 obj1 = new Cstr_exp3(22);
	//Cstr_exp3 obj2 = new Cstr_exp3(19,100,1000);
		
	
	}

}
