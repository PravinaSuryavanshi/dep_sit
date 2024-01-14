package mock;

public class Upcstingdttype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=9980;//as int is of 4 byte
		
		System.out.println("variable"+a);
	
		
		//implicit casting
		
		double b=a;//as double is of 8 byte
		
		//converting lower data type to higher datatype
		System.out.println("implicit casting is "+b);
		
		System.out.println("=================================");
		
		//converting higher data type to lower datatype
		
		System.out.println("value is in double"+half);
		
		int full= (int)half;//int it is of 4 byte.
		
		System.out.println("explicit casting is"+full);
	}

}
