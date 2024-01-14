package polymorpshism;

public class Compile_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compile_time obj =new Compile_time();
		obj.addition();
		obj.addition(10,20);
		obj.addition(19.0f,60);

	}
	
	
	public void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is"+sum);
	}
	
	public void addition(int a ,int b)
	{
		int sum=a+b;
		System.out.println("addition"+sum);
	}
	public void addition (float a, int b)
	{
		float sum= a+b;
		System.out.println("addition"+sum);
	}
}

