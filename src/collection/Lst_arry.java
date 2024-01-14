package collection;

import java.util.ArrayList;

public class Lst_arry {
	/*duplicate are allowed in aaraylist.
	 * allows any no of null values
	 * storage type:index
	 * order of insertion -maintain
	 * default capacity for arraylist is 10
	 * data structure :resizable.
	 * incremental capacity=(current capacity*3/2)+1=10*1.5+1=16==>16*1.5+1=25.
	 * best choice:retrival operation(random access interface is implemented in arraylist & vector).
	 * worst choice:manipulation(change) operationi.e. insertion in between arraylist or delete()
	 *  storage type:index.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList al=new ArrayList();
          //insertion method-------->>>>>
          al.add("hi");
          al.add(100);
          al.add(12.12f);
          al.add("true");
          al.add('A');
          al.add(null);
          al.add(null);
          al.add(null);
          al.add("pune");
          al.add("pune");
          System.out.println(al);
         
          
	}
}
