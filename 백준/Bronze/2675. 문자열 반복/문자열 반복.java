import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int m = sc.nextInt();
			String str = sc.next() + "";
			int count = str.length();
			char[] a = new char[count];
			for (int j=0; j<count; j++) {
				a[j] = str.charAt(j);
				for (int k=0; k<m; k++) {
					System.out.print(a[j]);
				}
			}
			System.out.println();
		}
	}
	
}
