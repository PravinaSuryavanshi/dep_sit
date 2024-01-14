package constr;

import constructors.Student;
import constructors.students;

public class Resuit1 {
	
	//public class Result1 {
		
		Resuilt(int rollno, String name, float fee)
		{
			rollno=rollno;
			name=name;
			fee=fee;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Student s1=new Student(111,"ram",5000f);
			
			
			
			s1.display();
			
	//when variables and parameter names are same so compiler get confuse .
			//it gives 0 0 or null value.
					
//========================================
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		         students s1=new students(111,"ram",50f);
		         students s2=new students(10,"shyam",600f);
		         
		         
		         s1.display();
		         s2.display();
			}
		}

	}

}
