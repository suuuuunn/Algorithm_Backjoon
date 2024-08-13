import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += Math.pow(2, i-1);
			// System.out.println("sum: " + sum);
		}
		sum += 2;
		// System.out.println("sum: " + sum);
		System.out.println((int) Math.pow(sum, 2));
		
	}
	
}