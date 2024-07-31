import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int m = sc.nextInt();
		
		for (int l=0; l<m; l++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int p = i - 1; p<j; p++) {
				a[p] = k;
			}
		
		}
		for (int q = 0; q<n; q++) {
			System.out.print(a[q] + " ");
		}

	}
	
}
