import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			String str = sc.next() + "";
			int len = str.length();
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(len - 1));
			System.out.println();
		}
		
	}
	
}