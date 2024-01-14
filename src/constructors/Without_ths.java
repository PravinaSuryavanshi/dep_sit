package constructors;

public class Without_ths {
	
	
	int rollno;
	String name;
	float fee;
	
	Without_ths(int rollno, String name, float fee)
	{
		rollno=rollno;
		name=name;
		fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	//--------------------------------------------------------------
	
	//Result1(int rollno, String name, float fee)
	/*{
		rollno=rollno;
		name=name;
		fee=fee;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Without_ths s1=new Without_ths(111,"ram",5000f);
		
		
		
		s1.display();
		
//when variables and parameter names are same so compiler get confuse .
		//it gives 0 0 or null value.
				
	
	}
}

	


