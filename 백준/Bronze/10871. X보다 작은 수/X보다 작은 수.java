import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		
		int a[] = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0; i<a.length; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		
	}
	
}