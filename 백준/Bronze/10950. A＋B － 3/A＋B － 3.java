import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		
	}
	
}
