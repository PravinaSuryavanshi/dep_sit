package mock;

public class Max {

	public static void main(String[] args) {
		// find max number using array
		
	    int [] num = {2,4,5,8,6,67,90};
	    int max =num[0];
	    for (int i=0; i<num.length; i++)
	    {
	    	if (num [i]>max)
	    		max=num[i];
	    	
	    }
	    System.out.println(max);
	}

}
