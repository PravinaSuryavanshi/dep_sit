package interfac2;

public interface Mother 
{
	void look();
	void nature();
	default void love()
	{
		System.out.println("mother love");
	}
 static void mom()
 {
	 System.out.println("mom");
	 
 }
}
