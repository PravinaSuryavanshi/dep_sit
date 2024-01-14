package arrayy;

public class Days_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // type[]days=new type[size];
        String [] days=new String [7];   //declaration
        
        days[0]= "monday" ;             //initialization
        days[1]= "tuesday";
        days[2]= "wednesday";
        days[3]= "thursday";
        days[4]= "friday";
        days[5]= "saturday";
	    days[6]= "sunday";
	    
	    
	    System.out.println("monday");   //usages
	    System.out.println("tuesday");
	    System.out.println("wednesday");
	    System.out.println("thursday");
	    System.out.println("friday");
	    System.out.println("saturday");
	    System.out.println("sunday");
//------------------------------------------------------------------------------
	    String []days1 ={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
	     for(int i = 0; i<7; i++)
	     {
	    	 System.out.println(days1[i]);
	     }
    
	}
}
