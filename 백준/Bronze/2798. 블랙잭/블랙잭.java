import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt(); int sum = s.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int min = 300000;
		int msum = 0; int fsum = 0;
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					msum = arr[i] + arr[j] + arr[k];
					if ((sum - msum) < min && (sum - msum) >= 0) {
						min = sum-msum;
						fsum = msum;
					}
				}
			}
		}
		System.out.println(fsum);
	}
	
}