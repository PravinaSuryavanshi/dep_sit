package arrayy;

public class array_study {
  // array is a data structure which store value of same datatype.
	//ex int[]array will have only integer values,,, 
	//string[] array will have only string  values like name city name,,,
	//when we declare array we have to give size of the array ex char[] gender= new char[3]
	//array size is fix.
	//array is an object.
	//array index starts from zero .
	//array is two types 1.single dimention array int ar[] = new int[4];
	//2. double dimention array Int ar[][]=new int[2][2]


	public static void main(String[] args)
	{
	//I want to store student names
		
	String name[]= new String[5];//declaration array
	int tableOf2[]= new int[10];
	char[] gender= new char[3];
	
	
	String pet[]=new String[2];
	int gi[]=new int[6];
	
	//I want to store players
	
	String[] players= new String[10];// Array Declaration
	
	players[0]="Gill"; // Array initialization
	players[1]="Rohit";
	players[2]="Virat";
	players[3]="KL";
	players[4]="Surya";
	players[5]="yu";
	players[6]="ps"; // Array initialization
	players[7]="Rot";
	players[8]="rat";
	players[9]="kkL";
	//players[10]="Surya";
	//players[11]="yu";
	
	System.out.println(players[0]);//Array Usage
	System.out.println(players[1]);
	System.out.println(players[2]);
	System.out.println(players[3]);
	System.out.println(players[4]);
	System.out.println(players[5]);
	System.out.println(players[6]);//Array Usage
	System.out.println(players[7]);
	System.out.println(players[8]);
	System.out.println(players[9]);
	//System.out.println(players[10]);
	//System.out.println(players[11]);
	System.out.println("====================================");
	
	int[] rollNum=new int[10];// Array Declaration
	rollNum[0]=10; // Array initialization
	rollNum[1]=11;

	rollNum[2]=12;
	rollNum[3]=13;
	rollNum[4]=14;
	// rollNum[5]=15;
	System.out.println(rollNum[0]);////Array Usage
	System.out.println(rollNum[1]);
	System.out.println(rollNum[2]);
	System.out.println(rollNum[3]);
	System.out.println(rollNum[4]);
	
	//fix or static for loop
	System.out.println("====================================");
	for(int i=0;i<=4;i++)//0->1->2->3->4
	{
	System.out.println(rollNum[i]);
	}
	System.out.println("====================================");
	System.out.println(rollNum.length);
	System.out.println("====================================");
	
	//vary or Dynamic for loop
	for(int i=0;i<=rollNum.length-1;i++)
	{
	System.out.println(rollNum[i]);
	}
	}
	}


