package abstractmn;

public class Sanay extends Satish{

	public static void main(String[] args) 
	{
		Sanay boy =new Sanay();
		boy.baby();
		boy.car();
		boy.cg();
	}

	public void baby()
	{
		System.out.println("i am baby");
	}

	@Override
	public void cg() 
	{
	   System.out.println("cg talwade");	
	}

	@Override
	public void car()
	{
		System.out.println("car-gray");
		
	}
	
	

}
