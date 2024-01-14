package keywords;

public class Super_keyword extends This_keyword {


		int a=1000; //global non static variable from sub class
		public static void main (String []args)
		{
			Super_keyword su = new Super_keyword();
			su.test3();
			
		}
		
		public void test3()
		{
			int a=99; //local non static variable from sub class
			int sum = a+100; // used local value of a------->999
			System.out.println(sum+"used global value of a same class");
			int sum2 = b+100; //used global value of b----->190 from super class (this_keyword)
			System.out.println(sum2+"used global value of a super class");
			int sum3 = super.a+100;//used global value of a------>100 from super class
			
			System.out.println(sum3+"used global value of a super class");
			
		}
	}


