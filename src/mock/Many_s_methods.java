package mock;

public class Many_s_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s="Pune";
		//1
		int length =s.length();
		
	     //2,3
		
		System.out.println("check the uppercase"+s.toUpperCase());
		System.out.println("check the lowercase"+s.toLowerCase());
		
		//4
		
		String x1="Pune";
		String x2="nasik";
		
		System.out.println("check the equals=="+x1.equals(x2));
		
		//5
		
		char a=x1.charAt(3);
		
		System.out.println("character is index==="+a);
		
		//6
		
		boolean b1=x1.contains("Pu");
		
		System.out.println(b1);

}}
