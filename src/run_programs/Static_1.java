package run_programs;

public class Static_1 {
	// the public keyword is an access specifier used for classes, attributes,
	//methods and constructors, making them call by any other class.
    // it means the method will be visible in other packages.

	public static void main(String[] args) {
		//syntax :- public access specifier(public,private,protected, package/default),  
		//modifier(static, non-static) , return type(void,string,double,char), method name (arguments)  
		//address();--->  methodname();
		
		
		//classname.methodname();
		Static_1.address1() ;
		Static_1.address2() ;
		
		address1() ;
	    address2();
		}
	
	
	public static void address1()
	{

		System.out.println("hi this is my address1");
		//system is a class, out is a reference variable , println is method (ln means new line)
	}
	
	public static void address2()
	{

		System.out.println("hi this is my address2");
	}
	
	
}
