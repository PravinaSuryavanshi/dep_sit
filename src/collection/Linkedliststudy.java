package collection;

import java.util.LinkedList;

import abstractmn.A;

public class Linkedliststudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		LinkedList<Character> li=new LinkedList<>();
		System.out.println(li);
		li.add('A');
		li.add('B');
		li.add('C');
		li.add('D');
		li.add('E');
		li.add('A');
		li.add('B');
		li.add(null);
		li.add(null);
		System.out.println(li);
		li.addFirst('M');
		li.addLast('z');
		System.out.println(li);
		//---------clone----------
		System.out.println(li.contains('Y'));
		System.out.println(li.contains('z'));
		//---------------------element method---------------------------
		System.out.println(li.element());//o/p->M (not removed M)
		System.out.println(li);
		System.out.println(li.peek());//o/p------->M
		System.out.println(li.poll());//o/p-------->M (removed M)
		System.out.println(li);
		System.out.println(li.get(0));//o/p---------->A
		System.out.println(li.getFirst());//o/p-------->A
		System.out.println(li.getLast()); //o/p---------->z
		System.out.println(li.isEmpty());//o/p--->false
		System.out.println(li.offer('x'));//o/p[A,,,,,,,Z,X]
		System.out.println(li.offerFirst('L'));//[L,A,....X]
		System.out.println(li.offerLast('J'));//--------->[L,A.class...X,J]
		System.out.println(li.pop());
		System.out.println(li);
		System.out.println('M');
		System.out.println(li.remove());
		System.out.println(li);
		
		


		
		
	}

}
