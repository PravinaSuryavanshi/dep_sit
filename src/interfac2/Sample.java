package interfac2;

public class Sample implements Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sample s=new Sample();
      s.demo1();
      s.demo2();
      s.demo3();
      s.demo4();
	}

	@Override
	public void demo1()   //method from interface1
	{
		// TODO Auto-generated method stub
		System.out.println("method demo1 completed in implementation class");
		
	}

	@Override
	public void demo2() //method from interface1
	{
		// TODO Auto-generated method stub
		System.out.println("method demo2 completed in implementation class");
		
	}

	@Override
	public void demo3()//method from interface1
	{
		// TODO Auto-generated method stub
		System.out.println("method demo3 completed in implementation class");
		
	}

	@Override
	public void demo4() //method from interface1
	{
		// TODO Auto-generated method stub
		System.out.println("method demo4 completed in implementation class");
		
	}

}
