package control_statement;

public class Nested_if_else_condition {

	public static void main(String[] args) {
		//if email id is correct then please enter password
		// if password is correct then welcome to home page
	//else password is wrong then please enter correct password
		//else email id is wrong then please enter correct email id
		String email="suryavanshi.pravina@gmail.com";
		String password ="0001";
		
		if(email == "suryavanshi.pravina@gmail.com")  // outer if statement
		{
			System.out.println("please enter password");
					
		     if(password=="0001") //inner if statement
		     {
		    	 System.out.println("welcome to home page");
		     }
		     else //inner else statement
		    
		     {
		    	 System.out.println("please enter correct password");
		     }
		     }
		//else outer else statement
		{
			System.out.println("please enter correct email id");
		}
	}

}
