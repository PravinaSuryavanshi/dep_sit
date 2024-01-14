package keywords;

public class B extends A{
	int a=500; //global variable of classB

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
	}
	public void display() {
	int a= 200; //local variable
	/*System.out.println("local value of a is"+a);//caling local variable
	System.out.println("global value of afrom same class  is"+this.a);//caling global value of same class
	System.out.println("global value of a from super class is"+super.a);//caling global value of super class
	}*/
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	}

}
