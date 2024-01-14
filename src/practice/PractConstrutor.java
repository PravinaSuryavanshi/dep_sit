package practice;

public class PractConstrutor {
	int a;
	int b;
	int c;
	
	// when we create any object. compiler calls default costructor(without PARAMTERRS) with default values (0 )
	//costructor in java is used for creating object
	PractConstrutor(){
		a =5;
		b =6;
	}
	PractConstrutor(int x , int y){
		this.a = x;
		this.b = y;
	}
	PractConstrutor(int x , int y, int z){
		this.a = x;
		this.b = y;
		this.c = z;
	}
	public void summ(int a, int b)
	
	{
		int sum= a+b+c;
		System.out.println("print sum"+sum);
	}

}
