import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			int a = s.nextInt(); int b = s.nextInt();
			if (a==0 && b==0) {
				break;
			}
			if (a>b && a%b==0) {
				System.out.println("multiple");
				continue;
			} else if (a<b && b%a==0) {
				System.out.println("factor"); 
				continue;
			} else {
				System.out.println("neither");
				continue;
			}
		}
	}
}