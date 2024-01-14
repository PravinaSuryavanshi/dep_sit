package mock;

public class Encapsulatn {
	//encapsulation means data hidding.
	
	private int a=50;
	private int b=100;
	
	
	public void addition()
	{
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	 public int getAvalue()
	 {
		 return a;
	 }
	 public int getBvalue()
	 {
		 return b;
		 
	}
}
