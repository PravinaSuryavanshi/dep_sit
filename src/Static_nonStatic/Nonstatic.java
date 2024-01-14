//calling non static method form same class

package Static_nonStatic;

 public class Nonstatic {

	public static void main(String[] argsdjkuds) {
		// to call non static methods we need object
		//?how to create object
		//className=new className();
		Nonstatic obj = new Nonstatic();
		//created object
		
		
		// how to call non static method
		
		//syntax---. objectname.methodname();
		
		
		obj.test1();//calling non-staticmethod from same class
		obj.test2();//calling non-staticmethod from same class
	}
	
	public void test1() //non-static method complete and regular
	{
		
		System.out.println("thi is non statioc");
		
	}
	
	public void test2() //non-static method complete and regular
	{
		
		System.out.println("thi is non statioc");
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
