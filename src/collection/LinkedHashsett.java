package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String>lh=new LinkedHashSet<>();
System.out.println(lh.size());

       lh.add("Pune");
       lh.add("Pune");
       lh.add(null);
       lh.add(null);
       lh.add("mumbai");
       lh.add("nagpure");
       System.out.println(lh);
 //------------------------------for each loop--------------------
       
    	   for(String l:lh)
    	   {
    	   System.out.println(l);
    	   }
    	   
   //-----------------iterator-----------------------------------
    	   
    	   Iterator <String>it=lh.iterator();
    	   while (it.hasNext());
    	   {
    		   System.out.println(it.next());
    	   }
       }
	

}
