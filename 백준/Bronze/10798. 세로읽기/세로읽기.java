import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[][] arr = new char[5][15];
		int max = 0;
		for (int i=0; i<5; i++) {
			String str = s.nextLine();
			for (int j=0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
				// System.out.print(arr[i][j] + " ");
			}
			// System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		for (int j=0; j<15; j++) {
			for (int i=0; i<5; i++) {
				if (arr[i][j] != '\0') {
					sb.append(arr[i][j]);
				}
			}
		}
		System.out.println(sb);
	}
	
}
