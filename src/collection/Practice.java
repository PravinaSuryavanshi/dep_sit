package collection;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al=new ArrayList<>();
//-----------------------------add-method-----------------------------------
		boolean a1 = al.add("pune");  
		System.out.println(a1); //true
	
		boolean a2 = al.add(1);
		System.out.println(a2); //true
		
		 ArrayList<Object> bl=new ArrayList<>();
		 
		//Object b= bl.add(0,"goa");
	
		     bl.add(0, "goa");
            System.out.println(bl); //[goa]
//--------------------------clone-method------------------------------------------------------------
            Object c1=al.clone();
            System.out.println(c1); //[pune,1]
            
//------------------------------contain-method---------case sensitive----------return type boolean-----------------------------
           boolean cm = al.contains("pune");
            //boolean c2 = al.contains("delhi");
            System.out.println(cm);
            //System.out.println(al.contains("Pune"));
    	   // System.out.println(al.contains("mumbai"));

            ArrayList<Integer> elementList=new ArrayList<>();
            elementList.add(1);
            elementList.add(15);
            elementList.add(14);
            elementList.add(9);
            System.out.println(elementList);
            
            if(elementList.contains(10)) {
            	System.out.println("presern");
            }
            else {
            	System.out.println("not presenr");
            }
            
            for(int i =0; i<elementList.size(); i++) {
            	
				System.out.println(elementList.get(i));
            
    	   	}
	}
}
