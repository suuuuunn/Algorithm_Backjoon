import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for (int i=0; i<n; i++) {
			boolean flag = true;
			String str = s.next();
			if (str.length() == 1) {
				flag = true;
			}
			for (int j=0; j<str.length()-1; j++) {
				if (str.charAt(j) == str.charAt(j+1)) {
					continue;
				}
				for (int k=j+1; k<str.length(); k++) {
					if (str.charAt(j) == str.charAt(k)) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				count++;
			}
			str = "";
		}
		System.out.println(count);
	}
}