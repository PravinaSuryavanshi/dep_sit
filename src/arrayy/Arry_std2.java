package arrayy;

public class Arry_std2 {

	public static void main(String[]args)
	{
		//marks-->int
  int[] marks=new int[5];
		marks[0]=9;
		marks[1]=8;
		marks[2]=10;
		marks[3]=7;
		marks[4]=6;
		//
		int[] grade= {8,9,7,10,6,4};
		System.out.println(grade.length);
		
		//I want to store colours
		
		String[] colors= {"RED","BLACK","PINK","YELLOW"};
		
		//I WANT TO STORE ALPBHABATES
		
		char[] alpha= {'A','B','C','Z'};
		
		//fix for loop
		for(int i=0;i<=3;i++)
		{
		System.out.println(alpha[i]);
		}
		System.out.println("========================");
		
		//varying / dynamic
		for(int i=0;i<=alpha.length-1;i++)
		{
		System.out.println("alpha of "+i+" "+alpha[i]);

		}
		
		}

		
		
	}


