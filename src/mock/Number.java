package mock;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1,1,11,22,225,33,44,55,77,88
		//print duplicate num
		
		int a[]= {1,1,11,22,225,33,44,55,77,88}
		
		for (int i=0; i<a.length;i++)
		{
			for(int j=I+1; j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
		}
	}

}
