package variable;

public class Stic_variable3 {
	
	static int a =40; //static global variable

	public static void main(String[] args) {
		Stic_variable3  obj = new Stic_variable3();
		obj.home();
		System.out.println("value of a is"+a);//calling static global variable from same class
		System.out.println("value of p is "+ Stic_variable2.p); //calling static global variable from another class
	}
	public void home()
	{
		int b= 30;
		System.out.println("value of b is"+b);//local variable
		System.out.println("value of a is"+a);//static global  variable
		 

	}

}
