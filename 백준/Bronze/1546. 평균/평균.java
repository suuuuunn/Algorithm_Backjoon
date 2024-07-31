import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] a = new float[n];
		float max = 0;
		float sum = 0;

		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		// System.out.println("max: " + max);
		
		for (int i=0; i<n; i++) {
			a[i] = a[i]/max * 100;
			// System.out.print(a[i] + " ");
		}
		
		for (int i=0; i<n; i++) {
			sum += a[i];
		}
		// System.out.println();
		System.out.println(sum / n);
	}
	
}