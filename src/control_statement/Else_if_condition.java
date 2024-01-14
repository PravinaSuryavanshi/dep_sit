package control_statement;

public class Else_if_condition {

	public static void main(String[] args) {
		
		
		//if my gender is M then i am male
		//else if my gender id F i am female
		// else please enter gender value either M or F
		
		char gender ='F';
if(gender=='M')
{
	System.out.println("i am male");
}
else if (gender=='F')
	
{
	System.out.println("i am female");
}
else
{
	System.out.println("please enter gender value either M or F");
}
		
		System.out.println("=======================================");
		//if my marks are greater than or equal 80 & less than equal 100_________>i am dist.
		//if my marks are greater than or equal 66 & less than equal 80_________>i am 1st class
		//if my marks are greater than or equal 50 & less than equal 66_________>i am 2nd class
		//if my marks are greater than or equal 40 & less than equal 50_________>i am pass
		// else i am fail
		int marks= 66;
		if (marks>100)
		{
			System.out.println("please enter valid marks,should be less than 100");
		}
		else if (marks>80 && marks<=100)
		{
			System.out.println("i am dist");
		}
		else if (marks>=66 && marks <80)
		{
			System.out.println("i am 1st class");
		}
		else if (marks>=50 && marks<66)
		{
			
			System.out.println("i am 2nd class");
		}
		else if (marks>=40 && marks<50)
		{
			System.out.println("i am just pass");
		}
		else {
			
			System.out.println("i am fail");
		}
		}

		
		}

