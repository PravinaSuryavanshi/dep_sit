package parameters;

public class Example2 {

	public static void main(String[] args) {
		
		Example2 o1 = new Example2();
		o1.dwing();
		o1.dwing();
		o1.dwing();
		
		o1.dwing("five",504 ,'N' ,380000.657);
		o1.dwing("four",401 , 'Y' ,380000.000);
	}
	
	
//String floor=o1.dwing();
//System.out.println("new floor"+floor);
	
	public void dwing()// method without parameter
	//floor , flat number, garden phase
	{
	String floor;
	int flat_num;
    char garden_phase;
	double flat_price;
	 
	 
	floor="five";
	flat_num=504;
    garden_phase='N';
    flat_price=380000.657;
    
    System.out.println("========================================");
    System.out.println(" floor number is"+ floor);
    System.out.println("flat numberis"+ flat_num);
    System.out.println("is it garden phase "+garden_phase);
    System.out.println("flat price is "+flat_price);
    System.out.println("========================================");
	}
    
    //return floor;
		 
    public void dwing (String floor,int flat_num ,char garden_phase ,double flat_price)//method wth parameter
    {
    	System.out.println("========================================");
        System.out.println(" floor number is"+ floor);
        System.out.println("flat numberis"+ flat_num);
        System.out.println("is it garden phase "+garden_phase);
        System.out.println("flat price is "+flat_price);
        System.out.println("========================================");
    	}	
		 
    } 
	
	 
	 

	
	
	

