package constructors;

public class ZeroPrameter_default 
{
      static int a; //variable declaration
      static int b;
      int c;
      
      //use of constructor --->to initialize data a member/variable
      
     public ZeroPrameter_default () //user defined zero //without parameter constructor
     // zero parameter or without parameter constructor is also called default constructor 
     //which is only create by user
      
      
      {
    	  a=100;
    	  b=200;
    	 c=300;
      }
     
	public static void main(String[] args) 
	{
		//this constructor is called when an object of a class is created.
		
		
		ZeroPrameter_default o1 = new ZeroPrameter_default(); 
		
		//created object of a class
	
		        
		o1.addition();
	}
	
	public void addition()
	{
		int sum;
		sum=a+b+c;
		System.out.println("sum is "+sum);
	}

}
