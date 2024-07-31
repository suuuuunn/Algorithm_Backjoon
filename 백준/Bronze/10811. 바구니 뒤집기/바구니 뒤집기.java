import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++) {
			a[i] = i + 1;
		}
		
		for (int k=0; k<m; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int j2 = j;
			for (int l=i-1; l<=(i-1 + (j-i)/2); l++) {
				int temp = 0;
				temp = a[l];
				a[l] = a[j2-1];
				a[j2-1] = temp;
				j2--;
			}
		}

		for (int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
