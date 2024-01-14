package modifier;

import specifier.Division;

public class Sum extends Division{
	 int a;
	 int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Sum si= new Sum();
		si.summ(10, 20);
		
		Division ds = new Division();
		ds.div(10, 10);
		

	}
	public void summ(int a,int b)
	
	{
		int sum= a+b;
		System.out.println("print sum"+sum);
	}

}
