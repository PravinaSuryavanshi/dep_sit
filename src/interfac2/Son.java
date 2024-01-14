package interfac2;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Son s=new Son();
 s.hardwork();
 s.honesty();
 s.look();
 s.nature();
 s.love();
 Father.papa();
 Mother.mom();
 s.bike();
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.println("mother look completed in son class");
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("mother nature completed in son class");
	}

	@Override
	public void hardwork() {
		// TODO Auto-generated method stub
		System.out.println("father hardwork completed in son class");
	}

	@Override
	public void honesty() {
		// TODO Auto-generated method stub
		System.out.println("father honesty completed in son class");
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		Father.super.love();
		Mother.super.love();
	}
	public void bike()
	{
		System.out.println("son bike");
		
	}
	

}
