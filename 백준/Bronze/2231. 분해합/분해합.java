import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int min = 0;
		
		for (int i=n-1; i>0; i--) {
			int sum = 0;
			int int_i = i;
			String string_i = i + "";
			int k = string_i.length();
			sum += i;
			for (int j=k-1; j>=0; j--) {
				sum += int_i / Math.pow(10, j);
				int rest = (int) (int_i % Math.pow(10, j));
				int_i = rest;
			}
			if (sum == n) {
				min = i;
			}
		}
		System.out.println(min);
	}

}