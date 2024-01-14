package inharitance;

public class Daughter extends Mother
{
	
	
	
	public static void main(String[]args)
	{
		Daughter d=new Daughter();
		d.scooty();
		d.look();
		Daughter.laptop();
	}
	public void scooty()
	{
		System.out.println("dauther's scooty");
		
	}
	 
	public static void laptop()
	{
		System.out.println("daughter's laotop");
	}
	public  void look()
	{
		System.out.println("mother propertie");
	}
	

}
