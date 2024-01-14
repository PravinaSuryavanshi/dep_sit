package interfac;

final public class Test {
	
	// if we make any class as final class then we can not extend that class
	static int b=90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a =100; //we can not reassign value to the final variable
		String b = "hi";
		System.out.println(a);//a=a=20
		System.out.println(a);//a=a+40;
	}
		final void show()//we can not override final method 
		{
			System.out.println("show method from test class");
		}
	

}
