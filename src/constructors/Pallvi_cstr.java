package constructors;

public class Pallvi_cstr {
	
	
	{
		int a;
		int b;
		public Pallvi_cstr()
		{
			a=10;
			b=20;
		}
		public Pallvi_cstr(int x,int y)
		{
			a=x;
			b=y;
		}
		
		
		public void displayD()
		{
			System.out.println("value of a="+a);
			System.out.println("value of b=+b");
		}
	}
	
	//=================================================================
	class Employee1 extends Department
	{
		int c;
		public employee1()
		{
			//super();
			c=30;
			}
		
		public Employee1(int z)
		{
			super(100,200);
			c=z;
		}
		
		public void displayE()
		{
			displayD();
			System.out.println("value of c="+c);
		
			
		}
	}
//===================================================================
	
	public class ConstructorChaining{
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e=new Employee1();
		e.displayE();
		Employee1 e1=new
				Employee1(300);
		e1.displayE();
	}


}
