package keywords;

public class This_keyword {

	
         int a=100; //non static global variable
         int b= 190; // non static global variable
   static int c = 1; 
    public static void main(String[]args) {
    	This_keyword t=new This_keyword();//created object of a class
    	t.test();
    	This_keyword.test1();
    }
    	
   
    
    
    public void test()
    {
    	int a=101; //non static local variable
         int sum1 =a+10;
         System.out.println("sum is"+sum1);
         int b=900;
         int sum2=this.b+10;
         System.out.println("sum is "+sum2);
         int sum3=a+b;
         System.out.println("sum3"+sum3);

         int div=c/10;//we can use static variable in static as well as non static method
         System.out.println("div is"+div);
         
    } 
    static void test1()
    {
    	//int mul=a*10; // we can not use non-static variable in static method
    	int mul=c*100;
    	System.out.println("mul is"+mul);

    
    
	}

}
