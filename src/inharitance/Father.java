package inharitance;

public class Father {
	int a = 10;
	int b = 20;
	//protected void hardwork()
	//hardwork(50)
	public void hardwork(int x)
	{
		//this keyword is used to refer current class vairables and methods

	this.b = x;
	System.out.println("a" + a + " b " + b);
	}
 public static void main(String[]args)
 {
	 Father f=new Father();
	 f.hardwork(99);
	 
 }
}
