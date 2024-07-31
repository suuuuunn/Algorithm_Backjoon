import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next() + "";
		int n = str.length();
		int count = 0;
		
		char pal[] = new char[n];
		char lap[] = new char[n];
		
		for (int i=0; i<n; i++) {
			pal[i] = str.charAt(i);
			// System.out.print(pal[i] + " ");
		}
		// System.out.println();
		for (int i=0; i<n; i++) {
			lap[i] = pal[n-i-1];
			// System.out.print(lap[i] + " ");
		}
		
		for (int i=0; i<n; i++) {
			if (pal[i] == lap[i]) {
				count += 1;
			} else if (pal[i] != lap[i]) {
				count += 0;
			}
		}
		
		if (count == n) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
}