package Static_nonStatic;

public class Regular_static {

	
	//static method calling from another class
		
		
	public static void main(String[]args)
	{
		//methodName();
		
		
		demo1();//calling static method from same class
		demo2();
		
		//calling static method from another class
		
		//className.methodName();
		
		//MyClass2.sample1();//calling static method from another class
		//MyClass2.sample2();//calling static method from another class
		
		
	}
	
	
	public static void demo1()//static regular complete method
	
	{
		
		System.out.println("hi this is demo1 method from MyClass1");
		
	}
	
	public static void demo2()//static regular complete method
	
	{
		System.out.println("hi this is demo2 method from myclass1");
		
	}
	
	


	}

