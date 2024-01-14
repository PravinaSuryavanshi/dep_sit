package abstractmn;

public class Concrete_class extends abstc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Concrete_class cc=new Concrete_class();
		
		cc.home1(); //calling method from abstc class------>completed in Concrete class   ( method from abstc class)
		cc.home2(); //calling method from abstc class------>completed in Concrete class (method from abstc class)
		cc.home3(); //calling method from abstc class------>completed in  (abstract class)
		abstc. home4(); //calling method from abstc class------>completed in sample (abstract class)

	}		
	//cc.home1(); //calling method from abstc class------>completed in sample (abstract class)

public  void home3 ()//complete method
{
	System.out.println("own method from concrete class");
}
	//public abstract void home2 () ; //incomplete method 

@Override
public void home1() {
	
	System.out.println("home1mkmmk");
	
}

@Override
public void home2() {
	System.out.println("home2nknn");
	
}
	

}
