package constructors;

public class With_ths {
	
	//if there is ambiguity between the instance variable and paramater ,
	//this keyword resolves the problem of ambiguity.
	
	//if instance variable and parameters are different,
	//then there is no need to use this keyword.
	
	int rollno;
	String name;
	float fee;
	With_ths(int rollno,String name,float fee)
	{
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" " +fee);
	}
//-------------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         With_ths s1=new With_ths(111,"ram",50f);
         With_ths s2=new With_ths(10,"shyam",600f);
         
         
         s1.display();
         s2.display();
	}
	
}
