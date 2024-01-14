package inharitance;

public class Young_multi extends elder {
	
	
	public void toy()
	{
		System.out.println("my toy");
	}
 
	public static void main(String[]args)
	{
		Young_multi y=new Young_multi();
		y.toy();
		y.job();
		y.health();
		
	}
}
	//============================================================
	
	class elder extends old
	{
		public void job()
		{
			System.out.println("job");
			
		}
	}
	//===========================================================
	class old{
		
		public void health()
		{
			System.out.println("heath");
			
		}
	}




