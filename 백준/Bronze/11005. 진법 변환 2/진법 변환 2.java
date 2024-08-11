import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int decimal = s.nextInt();
		int n = s.nextInt();
		int de = decimal;
		StringBuilder sb = new StringBuilder();
		while (decimal > 1) {
			if (decimal % n < 10) {
				de = decimal % n;
				sb.append(de);
			} else {
				de = decimal % n + 55;
				char ch = (char) de;
				sb.append(ch);
			}
			decimal /= n;
		}
		if (decimal != 0) {
			sb.append(decimal);
		}
		System.out.println(sb.reverse());
	}

}
