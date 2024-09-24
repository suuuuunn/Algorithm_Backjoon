import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int n = s.nextInt();
			if (n == -1) {
				break;
			}
			for (int i=1; i<=n/2; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (sum != n) {
				System.out.println(n + " is NOT perfect.");
				sum = 0;
			} else if (sum == n) {
				System.out.print(n + " = 1");
				for (int i=2; i<=n/2; i++) {
					if (n % i == 0) {
						System.out.print(" + " + i);
					}
				}
				sum = 0;
				System.out.println();
			}
		}
	}
}