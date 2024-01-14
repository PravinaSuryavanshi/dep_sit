package run_programs;

public class Nonstatic_3 {

	public static void main(String[] args) {
		// to call non -static method from same class
		//create a object
		//ClassName ObjectName=newClassName();
		
		Nonstatic_3 s1=new Nonstatic_3();
		
		//to call non-static method......>
		//objectname.methodname();
		
		
		s1.sum();//calling non static method for same class
		s1.c();//calling non static method for same class
		s1.d();//calling non static method for same class
		
		
		}
		
public void sum()// non static regular method
{
	int a = 10;
	int b = 15;
	System.out.println("this is doing sum " + (a+b));
}

public void c()// non static regular method
{
	System.out.println("this is C non static method from nonstatic_3");
}

public void d()// non static regular method
{
	System.out.println("this is d non static method from nonstatic_3");
}
	
	
	


}
