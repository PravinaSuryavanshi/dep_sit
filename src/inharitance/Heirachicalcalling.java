package inharitance;

public class Heirachicalcalling {
	
	
	public static void main(String[] args)
	{
	 
		Father f= new Father();
	f.hardwork(50);//super class object calling super class method
	
	Son1 s1= new Son1();
	s1.thar();//sub class object calling sub class method
	s1.hardwork(40);//sub class object calling super class method**
	
	Son2 s2= new Son2();
	s2.bullet();//sub class object calling sub class method
	s2.hardwork(80);//sub class object calling super class method**
	}

}
