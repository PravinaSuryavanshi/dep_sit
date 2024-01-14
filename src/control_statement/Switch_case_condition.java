package control_statement;

public class Switch_case_condition {

	public static void main(String[] args) 
	{
		//M-------->male
		//F-------->female
		//a-z-------> please enter correct gender value------>defalt
		char gender ='F';
		switch (gender)//M , F
		{
		case 'M':System.out.println("i am male");
		break;
		case 'F':System.out.println("i am female");
		break;
		default:System.out.println("please enter correct gender value");
		break;
		}
		System.out.println("================");
		//1-7
		//1===============>monday     7=========>sun
		int day =6;
		switch(day)
		{
		case 1:System.out.println("today is monday");
		break;
		
	case 2:System.out.println("today is tuesday");
	break;
	case 3:System.out.println("today is wednesday");
	break;
	case 4:System.out.println("today is thursday");
	break;
	case 5:System.out.println("today is friday");
	break;
	case 6:System.out.println("today is saturday");
	break;
	case 7:System.out.println("today is sunday");
	break;
	default:System.out.println("please enter day between 1-7");
	break;
	}
	
	
	
	
	
	
	
	
	
		

	}

}
