package mock;

public class Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=786;
		int sum =0;
		
		while(no!=0)
		{
			int n =no%10;
			no = no/10;
			sum =sum+n;
			{
				System.out.println("sum is"+sum);
			}
		}

	}

}
