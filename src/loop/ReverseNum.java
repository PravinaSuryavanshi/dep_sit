package loop;
public class ReverseNum{
	static int num = 289;
	static String ans ="";
	public static void main(String args[]){
		while(num >0) {
			int rem  = num % 10;
			ans = ans.concat(String.valueOf(rem));
			int divident = num / 10;
			num = divident;
		}
		System.out.println(ans);
	}
}