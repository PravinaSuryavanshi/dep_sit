package string;
public class Methods {
	
	//1.string is non primitive datatype .
	//2 memory size is not fix
	//3 string is the sequence of character.
	//3 syntax of string =======> public final class extends object)object  is parent class of string. 
	//3 "string is used to store collection of character".
	//4 string is an inbuilt class which is presented inside "java.land"package.
	//5 at the time of string declaration and initialization ,object create take place.
	//6 string object are immutable in nature /can't be change.
	//7 object creation of string is done in two ways.
	       // 1.without using new keyword=>string s1="abcd";
	       //2. using new keyword => string s2=new string ("xyz");
	//======================================================================================
	//8 string object are going to get stored inside string pool area which is present inside heap area.
	//9 string pool area =>it is used to store string object ,which classified into 2 area
	       //1. constant pool area 
	        //2. non constant pool area
	
//1.constant pool area => during object creation time if we don't make use of "new" keyword the object
	                    //creation take place inside constant pool area ,duplicate objects are not allowed inside constant pool area.
 //2. non constant pool area => during object creation time if we don't make use of "new" keyword the object
		                  //creation take place inside non constant pool area ,duplicate objects are in non constant pool area.
		
public static void main(String[] args)
{
	
	
	
//length()   it returns string length.returntype is .............integer...................
String s="Pune INDIA MH";
int slength = s.length();
System.out.println("Length of string is "+slength);//length of string is 13



System.out.println("===========================");




//2. touppercase() 
//1. string toupper case()   it returns a ...........string---------- in upper case.
//2. string to upper case(local l)    it returns a string in upper case using specified local.

String a="Pune";
System.out.println(a.toUpperCase());//1 PUNE 

String upperCase = a.toUpperCase();
System.out.println(upperCase);//2 PUNE
//3. toLowerCase()
//string to lower case()------->it returns a ............string in............... lower case.
//string to lower case(local l)------------>it returns a strings in lower case using specified locate.

System.out.println(upperCase.toLowerCase());//3 pune 

String lowerCase = upperCase.toLowerCase();
System.out.println(lowerCase);//4 pune



System.out.println("===========================");


// 4. equals()
// boolean equals(object another)-------->it checks the equality of string with the given object.
//return type is ..........................boolean...................

String x1="Velocity";
String x2="Velocity";
String x3="velocity";
String x4= new String("Velocity");

String x5= new String("Velocity");
String x6= new String("velocity");
boolean result = x1.equals(x2);
System.out.println(result);//t
System.out.println(x2.equals(x4));//t
System.out.println(x2.equals(x3));//case sensitive//f
System.out.println(x1==x2);//t
System.out.println(x1==x4);//f
System.out.println(x5==x4);//f

//5. equalsIgnoreCase()
//static string equal ignore case(string another)-------------->it compares another string.it does not check case.
//it ignore upper and lower case and check sequence of charater
//returntype......................boolean............................

System.out.println(x2.equalsIgnoreCase(x3));//t
System.out.println("===========================");



//6. contains()
//boolean contains(char sequences)--------->it returns true or false after matching the sequence of character value.
//returntype......................boolean.........................
String y1="INDIA";
System.out.println(y1.contains("A"));//t
System.out.println(y1.contains("a"));//f
System.out.println(y1.contains("IND"));//t
System.out.println(y1.contains("NDA"));//f
System.out.println("===========================");



//7. isEmpty()
// boolean is empty()------------->it checks if string is empty.
//returntype....................boolean........................
String a1="Katraj";
String a2="";
String a3=" ";
System.out.println(a1.isEmpty());//f
System.out.println(a2.isEmpty());//t
System.out.println(a3.isEmpty());//f



// isBlank
//returntype..................boolean....................
System.out.println(a1.isBlank());//f
System.out.println(a2.isBlank());//t
System.out.println(a3.isBlank());//t
System.out.println("===========================");



//8. charAt
//char charAt(int index)---------->it returns char value for the particular index.
//returntype.....................char...........................
String b1="Velocity";
String b2="Katraj";
char myChar = b1.charAt(1);
System.out.println(myChar);//1-..........e
System.out.println(b1.charAt(4));//......c
// System.out.println(b1.charAt(40));
// System.out.println(b1.charAt(-4));
System.out.println("===========================");



// 9. endsWith
//returntype is ......................boolean.........................

String c1="Velocity";
System.out.println(c1.endsWith("city"));//t
System.out.println(c1.endsWith("loc"));//f
System.out.println(c1.endsWith("cty"));//f
System.out.println(c1.endsWith("Velocity"));//t
System.out.println("---------------------------------");

//10. startsWith
//returntype ........................boolean............................
System.out.println(c1.startsWith("city"));//f
System.out.println(c1.startsWith("Velo"));//t
System.out.println(c1.startsWith("loc"));//f

System.out.println(c1.startsWith("loc", 2));//t
System.out.println(c1.startsWith("ocity",3));//t
System.out.println(c1.startsWith("i",5));//t
System.out.println("===========================");



// 11. substring
//returntype....................string...............................
//1. string substring(int begine index)-------->it returns substring for given begin index.
//2.string substring(int begine index,int endindex)........>it returns substring for given begin index and end index.
String d1="MAHARASHTRA PUNE INDIA KATRAJ";
System.out.println(d1.substring(12));//PUNE INDID KATRAJ
System.out.println(d1.substring(17, 22));//INDIA
System.out.println(d1.substring(0, 11));//MAHARASTRA
System.out.println("===========================");



// 12. concat
//returntype.........................string...............................
//string concat(string str)---------->it concatenates the specified string.
String e1="Software";
String e2="Testing";
System.out.println(e1.concat(" ").concat(e2));//software testing
System.out.println(e1.concat("Development"));//softwareDevelopment
System.out.println("===========================");



// 13. indexOf
//.......................integer............................................
//1.int indexOf(int ch)------->it returns the specified char value index.
//2.int indexof(int ch,int from index)......>it returns the specified char value index starting with given index.
//3. int indexof(string substring)---->it returns the specified substring index.
//4. int index of(string substring, int from index)....>it returns the specified substring index starting with given index.
//14. lastIndexOf

String f1="mumbai";//m=0,u=1,m=2,b=3,a=4,i=5
System.out.println(f1.indexOf('i'));//5
System.out.println(f1.indexOf('u'));//1
System.out.println(f1.indexOf('m'));//0

//14 lastindexof
//returntype...........................integer...........................................
System.out.println(f1.lastIndexOf('m'));//2
String f2="success";
System.out.println(f2.lastIndexOf('s', 5));//5

String f3="beginning";//b=0,e=1,g=2,i=3,n=4,n=5,i=6,n=7,g=8
System.out.println(f3.indexOf("in"));//3
System.out.println(f3.lastIndexOf("in"));//6
System.out.println("===========================");



// 15. replace
//string replace(char old,char new)_____________>it replaces all occurrences of the specified char. 
//string replace (char sequence old,char sequence new)--------->it replaces all occurrance of the specified char sequence.
String g1="GA";
System.out.println(g1.replace('A', 'N'));
System.out.println(g1.replace("GA", "HI"));
String g2="INDIA IS MY COUNTRY";
System.out.println(g2.replaceAll(" ", "_"));

//17. split()
    
String s1="i_love_my_sivebaba";
String[]s2=s1.split("_");
for(int i=0;i<=s2.length-1;i++)
{
	System.out.println(s2[i]);
}
}
}
