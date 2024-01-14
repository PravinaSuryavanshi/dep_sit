package variable;

public class Stic_variable1 {
	static int a=40; //static global variable

	public static void main(String[] args) {
		
		Stic_variable1 s= new Stic_variable1();// create object step 1
		 
		s.show(); //call the method using object
		
		
		
		System.out.println("value of a is"+a);//calling static global variable from same class

		System.out.println("value of p is"+Stic_variable2.p);// calling static global  variable from another class
		
	}
		
	
	public void show()
	
	{
		int b = 30;
	System.out.println("value of b is"+b);//local variable

	System.out.println("value of a is"+a);//global  variable

}
}


