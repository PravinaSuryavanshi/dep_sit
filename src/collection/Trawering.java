package collection;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class Trawering {

	public static <integer> void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> al=new ArrayList<>();
      al.add(1);
      al.add(3);
      al.add(34);
      al.add(2);
      al.add(22);
      al.add(12);
      System.out.println(al);
      
 //----------------------------for --loop----------------------------------
     
	/*for(int i=0; i<=al.size()-1; i++)
      {
    	  System.out.println(al.get(i));//o/p-------->1
    	                                              3
    	                                              34......
    	                                              
    
      }*/
//-------------------------each ----for-loop-------------------------------------------------
      //Integer:We can perform operations such as reversing a number, rotating it left, or rotating it right.
      /* for (Integer a:al)                             1
                                                        3
                                                        34.....
             {
    	  System.out.println(a);
      }*/
//------------------------Iterator---------------------------------
       Iterator<Integer> it=al.iterator();          //o/p--->[1,3,34,....]
      
      while(it.hasNext());
      {
    	  System.out.println(it.next());
      }
  //----------------List-Iterator-------------------------------------
      ListIterator<Integer> lit=al.listIterator();         //o/p--->1
                                                             // 3
                                                             // 34......
      
      
     /* while(lit.hasNext())
      {
    	  System.out.println(lit.next());
      }*/
  //------------------using list iterator in reverse direction-----------------------
      while(lit.hasPrevious())
      {
    	  System.out.println(lit.hasPrevious());
      }
}

}
