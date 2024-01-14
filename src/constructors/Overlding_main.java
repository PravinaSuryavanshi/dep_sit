package constructors;

public class Overlding_main extends Overlding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Overlding r1 =new Overlding();
             Overlding r2 =new Overlding(10);
             Overlding r3 =new Overlding(23.89,"ram");
             
             System.out.println(r1.a+" "+r1.b+" "+r1.c);
             System.out.println(r2.a);
             
             System.out.println(r3.b+" "+r3.c);
             
	}

}
