package collection;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector<Integer> v =new Vector<> ();
               v.add(12);
               v.add(11);
               v.add(10);
               v.add(9);
               v.add(8);
               v.add(7);
               System.out.println(v);
               System.out.println(v.capacity());
               System.out.println(v.size());
               v.insertElementAt(10, 4);
               System.out.println(v);
               System.out.println(v.remove(5));
               System.out.println(v);
               System.out.println(v.remove(4));
               System.out.println(v);
               //" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 71
                v.setSize(9);
                System.out.println(v);
     
 
	}

}
