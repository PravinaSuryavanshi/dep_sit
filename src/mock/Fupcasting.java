package mock;

public class Fupcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("===========superclass=============");
	
	Fgrandfather gf=new Fgrandfather();
	gf.disipline();
	gf.honesty();
	
	System.out.println("============subclass==========");
	
	
	Ffather f=new Ffather();
	
	f.disipline();
	f.honesty();
	f.hardwork();
	
	
	System.out.println("=============upcasting=====================");
	
	//creating object of subclass and giving reference of superclass
	
	Fgrandfather gf1=new Ffather();
	        
	        gf1.disipline();
	        gf1.honesty();
	       // gf1.hardwork(); we can not access propertyof subclass
	        
// casting =>converting one type of information into another type is called casting 
//in java casting is classified into 2 types 1.primitive casting2. non primitive castin.
// 1.primitive casting =>converting one datatype of information into another datatype .it is three types
	       // 1.implicity primitive datatype =>converting lower datatype(byte) into higher datatype(short).
	        //also called widening casting,where memory size goes on increasing there is no data loss.
	
	
	
	}

}
