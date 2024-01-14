package practice;

public class Sum {
	
	public static String msg ="i am calculating sum";
	int firstnum =0;
	int secondnum =0;
	
	public void plus(int firstnumParam, int secondnumParam)
	{
	this.firstnum =firstnumParam;
	this.secondnum = secondnumParam;
	
	int sum = firstnum+secondnum;
	System.out.println("sum " + sum);

	//System.out.println(Sum.msg);
	}
	

}
