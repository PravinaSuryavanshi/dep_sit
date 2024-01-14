package mock;

public class Stringg_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		String name ="Pravina";
		int lenght =name.length();
		
		int halflenght=lenght/2;
		
		String firsthalf= name.substring(0, halflenght).toUpperCase();
		String secondhalf= name.substring(0, halflenght).toLowerCase();
		
		System.out.println(firsthalf +secondhalf);
	}

}
