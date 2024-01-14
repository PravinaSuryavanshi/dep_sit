package mock;

public class Expl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Exp1 e=new Exp1();
		e.addition(40,50);
		e.addition(10,20,30);
	}
		
		
		
		
		public static void addition (int a,int b)
		{
		int result1=a+b;
		System.out.println(result1);
		}
		
		public static void addition(int a,int b,int c)
		{
			int result2 = a+b+c;
			System.out.println(result1);
		}

	}


