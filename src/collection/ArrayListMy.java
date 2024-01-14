package collection;

import java.util.ArrayList;

public class ArrayListMy {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<>();
		//-1----------add-----------------------------------------
		boolean a1 = al.add("pune");
	    System.out.println(al.add("Pune"));
	    System.out.println(al);
	    al.add(0,"katraj");
	    System.out.println(al);
	    //--2 clear--------------------------------------
	    //al.clear();
	    //---3---------------clone---------------------------------
	    //System.out.println(al);
	    //clone return type object
	    Object alNew=al.clone();
	    //---4-------------contain-------------------------------------------
	    // contain:case sensitive......return type boolean
	    System.out.println(al.contains("Pune"));
	    System.out.println(al.contains("mumbai"));
	    //---5------------------ensure-----------------------------------------
	    al.ensureCapacity(3);
	    al.add("MH");
	    System.out.println(al);
	    al.add("Bharat");
	    System.out.println(al);
	    al.add("New");
	    //----6--equal-------------------------------------------------------
	    System.out.println("======================");
	    System.out.println(alNew);
	    System.out.println(al);
	    System.out.println(al.equals(alNew));
	    //---7-get---------------------------------------------------------
	    System.out.println("==========================================");
	    System.out.println(al.get(2));
	    //---8-index----------------------------------------------------------------------------
	    System.out.println("=====================================");
	    System.out.println(al.indexOf("MH"));
	    
	    //--------------------------------------------------------------------
	    System.out.println("========================================");
	    //al.clear();
	    //-----9-isempty-------------------------------------------------------
	    System.out.println(al.isEmpty());
	    System.out.println("=================================");
	    //-----10--remove-------------------------------------------------------------
	    System.out.println(al);
	    System.out.println(al.remove(1));
	    System.out.println(al);
	    System.out.println("======================");
	    //------11-set---------------------------------------
	    al.set(1, "Maharashtra");
	    System.out.println(al);
	    System.out.println("========================");
	    //------12 -size---------------------------------------------------------
	    System.out.println(al.size());
		}

	}


