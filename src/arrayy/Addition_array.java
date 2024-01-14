package arrayy;

public class Addition_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 10, 20, 30, 40, 60 };
		int sum = 0;
		int i;
		for (i = 0; i < A.length; i++) {
			System.out.println(" A[" + i + "] " + A[i] + " sum " + sum);
			sum = sum + A[i];
		}

		System.out.println("the sum is " + sum);
	}

}
