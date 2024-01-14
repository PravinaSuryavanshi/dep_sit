package constructors;

public class User_default_costructor {
  
	int a;
	int b;
	int c;
	
	//default constructor=> which does not have any argument or parameter is called default parameter.
	//default constructor is created by user first(if user not create then) compiler create.
 //when user create default constructor the he can use default constructor to initialize 
	//value(1,2,3) user's favorite value he can give into default constructor.
	//but if user not define defualt constructor then compile create defalut constructor 
	//atomaticaly but the variable a, b,c values will be 0,0,0.
	User_default_costructor() // default constructor create by user to initialize value
		{
		a =1;
		b =10;
		c=11;
		//System.out.println("hi i am constructor"+ a+" "+b);
		}
	
	public static void main(String[] args) {
	 
		
		User_default_costructor obj=new User_default_costructor(); //created object of a class
		obj.auto();
		}
	
	public void auto() //regular non-static method
	{
	System.out.println("hi good everything"+" "+a+" "+b+" "+c);
	}

}
