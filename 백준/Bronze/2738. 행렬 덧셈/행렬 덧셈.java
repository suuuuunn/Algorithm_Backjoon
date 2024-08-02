import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[][] = new int[2*n][m];
		for (int j=0; j<2*n; j++) {
			for (int k=0; k<m; k++) {
				arr[j][k] = s.nextInt();
				// System.out.print(arr[j][k] + " ");
			}
			// System.out.println();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr[i][j] += arr[i+n][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}