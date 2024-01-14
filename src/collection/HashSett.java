package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		/*HashSet<Object>hs=new HashSet<>();
		hs.add("hi");
		hs.add('m');
		hs.add(3);
		hs.add("true");
		hs.add(4);
		hs.add(3);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		*/
		//-------------------------------------------------------------
		HashSet<String>hs1=new HashSet<>();
		hs1.add("GN");
		hs1.add("Bye");
		hs1.add("hi");
		hs1.add(null);
		hs1.add(null);
		hs1.add("gn");
		System.out.println(hs1);
		//-------------------------------for each-------------------------
		for(String h:hs1)
		{
			System.out.println(h);
		}
		//----------------------iterator-----------------------------
		Iterator<String>it=hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
		
	}


