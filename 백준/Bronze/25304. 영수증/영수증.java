import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int n;
		x = sc.nextInt();
		n = sc.nextInt();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a * b;
		}
		System.out.println(sum == x ? "Yes" : "No");
	}
	
}