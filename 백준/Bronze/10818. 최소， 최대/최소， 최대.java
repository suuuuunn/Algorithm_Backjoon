import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = -1000000;
		for (int i=0; i<a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		int min = 1000000;
		for (int i=0; i<a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		System.out.print(min + " " + max);
		
	}
	
}