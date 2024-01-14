package interfac2;

public interface Father {
	void hardwork();
	void honesty();
	 default void love()
	 {
		 System.out.println("father love");
	 }
	 static void papa()
	 {
		 System.out.println("papa method");
	 }

}
