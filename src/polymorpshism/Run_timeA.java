package polymorpshism;



//run time polymorphism: Acquiring super class method into sub class with the help of 
//extends keyword & changing implementation/definition according to subclass
//specification is called method overriding.
public class Run_timeA {

	public void apple()
	{
	System.out.println("A's test method");
	}
	public void ant()
	{
	System.out.println("A's Display method");
	}
	public void arrow(int a, int b)
	{
	int sum=a+b;
	System.out.println("sum is "+sum);
	}
	
	
	public void bird()
	{
		System.out.println("runtimeA");
	}
	}