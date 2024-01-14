package run_programs;

public class Nonstatic_4 {

	public static void main(String[] args) {
		// to call non static method from another class
		//create an object
		
		//classname object name=newclassname();
		Nonstatic_3 o1 =new Nonstatic_3();
		
		//syntax--->objectname.methodname();
		  o1.c(); //calling non static method from another class
		  o1.d(); //calling non static method from another class
		  
		  //create an obejct of class nonstatic 4
		  Nonstatic_4 o2=new Nonstatic_4(); //same class
		  o2.e();
		  o2.f();
		  
}
	
	    public void e()// non static regular method
		  {
		  	System.out.println("this is c nonstatic method from nonstatic_3");
		  }
		  	
		  
		  
		  public void f()// non static regular method
		  {
		  	System.out.println("this is c nonstatic method from nonstatic_3");
		  }
		  	
		  	



}
