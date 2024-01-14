package inharitance;

public class Multilevel_inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
			Grandmother gm= new Grandmother();
			
			gm.receipe();//calling non static method from superMost class using object of superMost class
			
			Grandmother.keys();//calling static method from superMost class using class ref of superMost class
			
			Mother m= new Mother();
			
			m.look();//calling non static method from super class using object of super class
			
			gm.receipe();//calling non static method from superMost class using object of super class
			
			Mother.nature();//calling static method from super class using ref of super class
			
			Grandmother.keys();//calling static method from superMost class using ref of super class
			
			
			Daughter d= new Daughter();
			d.scooty();//calling non static method from sub class using object of sub class
			d.look();//calling non static method from super class using object of sub class**
			d.receipe();//calling non static method from superMost class using object of sub class
			
			Daughter.laptop();//calling static method from sub class using ref of sub class
			Daughter.nature();//calling static method from super class using ref of sub class**
			Grandmother.keys();//calling static method from superMost class using ref of sub class

	}

}
