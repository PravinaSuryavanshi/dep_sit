package inharitance;

public class Single_l_inhtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mother m=new Mother();                     //created object of superclass
		m.look();                                       //calling method from super class using superclass reff
	  
		//mother.nature();                               //calling static method from superclass using 
	//--------------------------------------------------------------------------------------------------------
		
		
		
		
		
		Daughter d=new Daughter ();                       //created object of subclass
	        
		d.scooty();                                     //calling method from subclass using sub class object
	         d.look();                                          //calling	method from superclass using subclass object 
	      
	        // daughter.laptop();                           //calling static method from subclass using subclass 
	      //daughter.nature();                          //calling static method from superclass using subclass ref.
	}
	
	

}
