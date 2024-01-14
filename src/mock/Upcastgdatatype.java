package mock;

public class Upcastgdatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//casting =>converting one type of information into another type is called casting 
//in java casting is classified into 2 types 1.primitive casting2. non primitive castin.
//1.primitive casting =>converting one datatype of information into another datatype .it is three types
       // 1.implicity primitive datatype =>converting lower datatype(byte) into higher datatype(short).
        //also called widening casting,where memory size goes on increasing there is no data loss.





		
		//primitive casting
		//implicit casting
		
		byte a=10;
		
		double b=a;
		
		{
			System.out.println(b);
		}

		
		//2 explicit casting
		
		//converting higher(int)datatype into lower (byte)datatype ,also called narrowing casting,
		//where memory size goes on decreasing in explocity casting data loss take place.
		
		double c=75.88d;
		
		int d = (int)c;
		System.out.println(d);
	}

}
//boolean casting =>