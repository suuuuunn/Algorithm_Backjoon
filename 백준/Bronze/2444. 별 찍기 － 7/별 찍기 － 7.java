import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l=1;
		for (int i=0; i<n*2-1; i++) {
			for (int j=n-l; j>0; j--) {
				System.out.print(" ");
			}
			l++;
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		l = 1;
		for (int i=n*2-3; i>0; i--) {
			for (int j=0; j<l; j++) {
				System.out.print(" ");
			}
			l++;
			for (int k=i; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
		
	}
	
}