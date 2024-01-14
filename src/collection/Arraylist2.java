package collection;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generaObjectthod stub
    ArrayList<Object> al=new ArrayList<>();
    System.out.println(al.add("Pune"));
    System.out.println(al);
    al.add(0,"katraj");
    System.out.println(al);
    //al.clear();
    //System.out.println(al);
    //clone return type object
    Object alNew=al.clone();
    // contain:case sensitive......return type boolean
    System.out.println(al.contains("Pune"));
    System.out.println(al.contains("mumbai"));
    //--------------------------------------------------------------
    al.ensureCapacity(3);
    al.add("MH");
    System.out.println(al);
    al.add("Bharat");
    System.out.println(al);
    al.add("New");
    System.out.println("======================");
    System.out.println(alNew);
    System.out.println(al);
    System.out.println(al.equals(alNew));
    System.out.println("==========================================");
    System.out.println(al.get(2));
    System.out.println("=====================================");
    System.out.println(al.indexOf("MH"));
    System.out.println("========================================");
    //al.clear();
    System.out.println(al.isEmpty());
    System.out.println("=================================");
    System.out.println(al);
    System.out.println(al.remove(1));
    System.out.println(al);
    System.out.println("======================");
    al.set(1, "Maharashtra");
    System.out.println(al);
    System.out.println("========================");
    System.out.println(al.size());
	}

}
