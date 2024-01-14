package keywords;

public class Thiss_keyword {

                                               
	//this keyword is used to access global variable from same or current class
		
		int a=90;//global variable
		int b=100;//global variable
		static int z=1; // static global variable
		public static void main (String[]args) {
			Thiss_keyword t= new Thiss_keyword();
			t.display();
		}
		public void display()
		{
			int a=10; //local variable
			int b=20; //local variable
			int z= 1000; //local variable
			
			System.out.println(a); //calling local variable
			System.out.println(this.a); //calling global variable using this keyword
			System.out.println(b); //calling local variable
			System.out.println(this.b);//calling global variable using this keyword
			System.out.println(z);//calling local variable 
			//System.out.println(this.z);//calling static global variable using this keyword
	
	}

}
