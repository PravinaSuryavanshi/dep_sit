package control_statement;

public class Switch_exp2 {
	
	//java switch statement contains multiple cases,where each case has a value.
	//the value inside the parenthesis of a switch statement expression is tested for equality
//against the value of each case.the case with a value matching to the value of the switch statement 
	//expression is executed.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// month
		
		//syntax
		//switch(expression){
		//case x:
		//code block
		//break;
		//case y:
		//code block
		//break;
	     int number=7;//declaration
	     
	     switch(number)//assignment
	     
	     {
	     case 1:System.out.println("jan");
	     break;
	     case 2:System.out.println("feb");
	     break;
	     case 3:System.out.println("march");
	     break;
	     case 4:System.out.println("april");
	     break;
	     case 5:System.out.println("may");
	     break;
	     case 6:System.out.println("jun");
	     break;
	     case 7:System.out.println("july");
	     break;
	     case 8:System.out.println("augut");
	     break;
	     case 9:System.out.println("sep");
	     break;
	     case 10:System.out.println("oct");
	     break;
	     case 11:System.out.println("nov");
	     break;
	     case 12:System.out.println("dec");
	     break;
	     default:System.out.println("invalid month!");
	     break;
	     }
	}

}
