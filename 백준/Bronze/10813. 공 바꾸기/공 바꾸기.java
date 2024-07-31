import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n]; 
		for (int c=0; c<n; c++) {
			a[c] = c + 1;
		}
		
		for (int p=0; p<m; p++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = 0;
			temp = a[i - 1];
			a[i - 1] = a[j - 1];
			a[j - 1] = temp;
		}
        
		for (int q=0; q<n; q++) {
			System.out.print(a[q] + " ");
		}
	}
}
