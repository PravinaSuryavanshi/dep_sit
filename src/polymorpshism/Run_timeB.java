package polymorpshism;

public class Run_timeB extends Run_timeA{


	public static void main(String[] args)
	{
	//Run_timeA a= new Run_timeA();// created object of super class
	Run_timeA a= new Run_timeB();// created object of sub class

	//b.boll();
	a.arrow(5, 1);
	a.arrow(2, 2);
	//a.arrow(5, 1);
	a.bird();
	a.apple();
	
	}
	
	public void boll()
	{
	System.out.println("B's red method");
	}
	public void book()
	{
	System.out.println("B's alphabet method");// differntiate with body part
	}
	@Override
	public void arrow(int a, int b)
	{
	int sub=a-b;
	System.out.println("mius is "+sub);
	}
	
	
	public void bird()
	{
		System.out.println("runtimeB");
	}
	}


