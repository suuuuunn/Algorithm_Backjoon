import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next() + "";
		int n = str.length();
		char arr[] = new char[n];
		int count = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] = str.charAt(i);
			count++;
			try {
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
					count--;
				} else if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
					count--;
				} else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					count = count - 1;
				} else if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
					count = count - 1;
				} else if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
					count = count - 1;
				} else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
					count = count - 1;
				} else if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
					count--;
				} else if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
					count--;
				}
			} catch (Exception e) { }
		}
		System.out.println(count);
	}
	
}