package abstractmn;

public abstract class abstc {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can not create object of an abstract class.

	//}
	

	public abstract void home1 (); //incomplete method
	
	public abstract void home2 () ; //incomplete method 
	
	public void home3() //complete method
	{
		System.out.println("complete method from abstract class");
	}
	public static void home4 () //static complete method
	{
		System.out.println("static complete method");
	
	}
	//public abstract static void home5();
	// we can not make static method as abstract  method.
}
