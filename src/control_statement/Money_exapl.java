package control_statement;

public class Money_exapl {

	public static void main(String[] args) {
	  int money =100;// 100<poor
	  //100<money &&money <500 middle , 500<money rich 
	  if(money<=100)
	  {
		  System.out.println("i am poor");
	  }
	  
	  else if (100<money&&money>500)
	  { 
		  System.out.println("i am middle class");
	  }
	  
	  else if (500<money)
	  {
		  System.out.println("rich");
	  }
	  else 
	  {
		  System.out.println("test money");
	  }
	  
	}
}
	


