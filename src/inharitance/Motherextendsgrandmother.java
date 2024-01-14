package inharitance;

public class Motherextendsgrandmother extends Grandmother 
     {
	
	   public void look()
	   
	   {
		   System.out.println("mothermom look");
	   }
	    public static void nature()
	    {
	    	System.out.println("mother's nature");
        }
	    public static void main(String[]args)
		{
			Mother m=new Mother();
			m.look();
			m.receipe();
			Mother.nature();
		}
  
}
