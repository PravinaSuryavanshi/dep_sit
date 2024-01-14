package collection;

import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<String> v=new Vector<>();
      v.add("MH");  //1
      v.add("AP"); //2
      v.add("TN");  //3
      v.add("KA");  //4
      v.add("PB"); //5
      v.add("UP"); //6
      v.add("DL");  //7
      System.out.println(v.capacity()); //o/p-->10
      System.out.println(v.size()); //o/p-->7
      System.out.println(v); //O/P---->[MH,AP,TN,KA,PB,UP,DL]
      v.insertElementAt("KL", 1);//working as add(index,element);
      System.out.println(v);//O/P----->[MH,KL,AP,TN,KA,PB,UP,DL]
      System.out.println(v.remove(3));// o/p---->TN
      System.out.println(v.remove("GA"));// O/P FALSE coz arraylist me "GA" not available
      v.setSize(16);
      System.out.println(v); // o/p [MH,KL,AP,KA,PB,UP,DL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL]
	}

}
