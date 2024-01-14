package interfac;

public class Production_tata implements TataLWV {
	
	// this class implement sub interface TataLWV
	//as TataLWV is sub interface, that its own property and properties form Tata
	// production Tata has to give definition to all incomplete method.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void truck() {
		// TODO Auto-generated method stub
		System.out.println("this is super interface truck");
	}

	@Override
	public void bus() {
		// TODO Auto-generated method stub
		System.out.println("this is super interface bus");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("this is sub interface car");
	}

	@Override
	public void minibus() {
		// TODO Auto-generated method stub
		System.out.println("this is sub interface minibus");
	}

}
