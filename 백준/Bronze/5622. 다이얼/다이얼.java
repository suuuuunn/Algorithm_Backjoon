import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		int n = dial.length();
		int count = 0;
		char[] arr = new char[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = dial.charAt(i);
			int alpha = (int) arr[i] + 1;
			if (alpha / 3 ==  22) {
				count += 3;
			} else if (alpha / 3 == 23) {
				count += 4;
			} else if (alpha / 3 == 24) {
				count += 5;
			} else if (alpha / 3 == 25) {
				count += 6;
			} else if (alpha / 3 == 26) {
				count += 7;
			} else if ((int) arr[i] / 4 == 20) {
				count += 8;
			} else if ((int) arr[i] / 3 == 28) {
				count += 9;
			} else {
				count += 10;
			}
		}
		System.out.println(count);
			
	}
	
}