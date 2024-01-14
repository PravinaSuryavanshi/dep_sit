package arrayy;

public class Basic_array {

	private static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TYPE [] arrayname =new TYPE [size];
		 int []marks=new int [3];
		 marks[0]=97;//physics
		 marks[1]=98;//chemistry
		 marks[2]=95;//English
		//---------------------------simple--way--to ----print----array-------- 
		 System.out.println(marks[0]);
		 System.out.println(marks[1]);
		 System.out.println(marks[2]);
		 
		 //----------standard way to print array---------------------------
		 for(int i=0; i<3; i++)
		 {
			 System.out.println(marks[i]);
		 }
		//----------------------------more standard way--------------------------
	 int [] marks1={97,98,95};
		 for (int a=0; a<3; a++);
		 {
			 System.out.println(marks1[a]);
		 }
		 
		 
	}

}
