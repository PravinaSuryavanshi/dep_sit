package inharitance;

public class Kid_multi extends Mom {
	
	int a=10;
	int b=20;
	public void add()
	{
		int sum=a+b;
		System.out.println("addition="+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kid_multi k=new Kid_multi();
		k.add();
		k.sub();
		k.mul();

	}
}
	

//=====================================================================
class Mom extends Grandmom
{
	int c=100;
	int d=200;
	public void sub()
	{
		int sub =c-d;
		System.out.println("subtraction="+sub);
	}
		}

//====================================================================

class Grandmom 
{
	int e=50;
	int f=40;
	public void mul()
	{
		int product=e*f;
		System.out.println("subtraction="+product);
	
	}
}


