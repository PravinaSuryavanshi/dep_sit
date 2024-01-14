package interfac;

public class Myclass implements Myinterfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myclass m=new Myclass();//created object of implementation class
		m.test();
		m.test1(12, 11);
		m.test1();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("method completed in implementation class");
	}

	@Override
	public void test1(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println(sum);
		
	}
 public void test1()
 {
	 System.out.println("own method of implementation class");
 }
}
