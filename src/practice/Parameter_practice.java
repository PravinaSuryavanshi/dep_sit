package practice;

public class Parameter_practice {
	public static void main(String[]args) {
		
		
		Para1 s1 =new Para1();
		s1.summ(1,2);
		
		
		Para2 s2= new Para2();
		s2.multi(10, 20);
		
		
		Para3 .division(21, 7) ;
		
		PractConstrutor pc1 = new PractConstrutor();
		pc1.summ();
		
		PractConstrutor pc2 = new PractConstrutor(1, 200);
		pc2.summ(50, 199);
		
		PractConstrutor pc3 = new PractConstrutor(10, 20, 30);
		pc3.summ();
	}

}
