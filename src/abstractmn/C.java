package abstractmn;

public class C extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c=new C();
		c.bird();
		c.home();

	}
	
	
	public void home()
	{
		System.out.println(("home "));
	}


	@Override
	public void bird() {
		// TODO Auto-generated method stub
		System.out.println("hjhjh");
	}
	
	

}
