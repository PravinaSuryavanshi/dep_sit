package control_statement;

public class Nasted_expl2 {

	public static void main(String[] args) {
	//nasted means something inside of something...
		int age=12;
		String gender ="male";
		
		if(age>18)
		{
			System.out.println("you are eligible");
			
			     if(gender=="male"){
			    	 System.out.println("you are invited");
			     }
		
		
		       else{
			    	 System.out.println("you are not invited");
			     }
		}
		
		
		
		else{
			System.out.println("you are not eligible");
		}
		
		
		

	}

}







