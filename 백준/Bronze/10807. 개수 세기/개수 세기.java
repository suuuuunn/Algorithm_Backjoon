import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for (int i=0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i=0; i < a.length; i++) {
			if (a[i] == v) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}