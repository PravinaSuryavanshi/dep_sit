package variable;

public class Stic_variable4 {
	int a=20;//non static global variable

	public static void main(String[] args)
	{
		
		Stic_variable4 s=new Stic_variable4();
		s.display();
		s.display();
		System.out.println("value of a after calling is"+s.a);//calling non static global variable from same class
		//Stic_variable2 s2=new Stic_variable2();
		System.out.println("value of p after calling is"+Stic_variable2.p);//calling static global variable from another class 
	}
		public void bh()
		{
		int b =30;//local variable
		System.out.println("value of b is"+b);//value of b will be so far display method only
		System.out.println("value of a is"+a);//value of a will be so far display method only
         }
  
	    public void display()
	    
	    { 
	    	int c= 40;//local variable
	    	int b= 50;
	    	System.out.println("value of b is"+b);
	    	System.out.println("value of c is"+c);
	    	System.out.println("value of a is"+a);
	    }
}
