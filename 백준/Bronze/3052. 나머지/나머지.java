import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int a[] = new int[10];
		int p=0;
		int count=1;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			a[i] %= 42;
		}
		
		for (int i = 1; i<a.length; i++) {
			for (int j = 0; j < i; j++) {
				p = 1;
				if (a[i] == a[j]) {
					p--;
					break;
				} 
				
			}
			if (p > 0) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
}