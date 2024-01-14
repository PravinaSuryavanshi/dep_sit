package constr;

public class Constructorr2 {
	
	
	// user defind default constructor :which does not have any argument is called default constructor.
			//1) user has to create default constructor to initialize value of variable.
			int a;
			int b;
			int c;
			
			public Constructorr2()
			{
				a=1;
				b=2;
				c=3;
			}

	public static void main(String[] args) {
		Constructorr2 t= new Constructorr2();
		t.use();
		
	}
		
		public void use()
		{
			System.out.println(a+" "+b + " "+c);
		}

	}

/*use of constructor
 * 1 to initialize non static variables.
 * 2to call methods
 * 3when we create object constructor is called. 
 */

