package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<Object>ts=new TreeSet<>();
		ts.add("pune");
		//ts.add(123);//class cast exception
		System.out.println(ts);
		ts.add(null);//null pointer exception
		System.out.println(ts);
		ts.add("mumbai");
		ts.add("dhule");
		System.out.println(ts);
		*/
		TreeSet<Integer>ts1=new TreeSet<>();
		ts1.add(10);
		ts1.add(1);
		ts1.add(3);
		ts1.add(4);
		ts1.add(5);
		ts1.add(8);
		ts1.add(7);
		ts1.add(6);
		ts1.add(9);
		System.out.println(ts1);
		System.out.println(ts1.ceiling(7));
		System.out.println(ts1.ceiling(4));
		System.out.println(ts1.floor(2));
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.size());
		System.out.println(ts1.remove(9));
		System.out.println(ts1);
		System.out.println(ts1.remove(2));
		System.out.println(ts1.higher(3));
		System.out.println(ts1.lower(10));
		//-----------------------for each---------------------------
		for(Integer t:ts1)
		{
			System.out.println(t);
		}
		//-------------iterator---------------------------
		Iterator<Integer> it=ts1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//-------------------descending iterator------------------
		Iterator<Integer> it1=ts1.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		}
		
		
		




		

		

	}


