package parameters;

public class Example1 {
	int p =10;//global variable
	public static void main(String[] args) 
	{
		int q =10;//instance
		
		Example1 w1 = new Example1();
		w1. addition();
		w1. addition();
		w1. addition();
		w1. addition();
		
		
		w1.addtion(1, 2);
		w1.addtion(3, 4);
		w1.addtion(5,6);
		
		w1.subtraction(10,1);
		w1.subtraction(20,0);
		w1.subtraction(30,15);
		
	}
	
	
	public void addition() //method without parameter
	{
		int a;
		int b;
		int sum;
		a=10;
		b=20;
		sum=a+b;
		System.out.println("addition is " +sum);
	}
//=====================================================================

	            
	
	public void addtion(int a, int b)  //with parameter
	{
		int sum = a+b;
	System.out.println("Addition is"+sum);
	}
	
//========================================================================================
	
	public void subtraction(int a, int b)  //with parameter
	{
		int sub = a-b;
	System.out.println("subtraction is"+sub);
	}
        	
}









