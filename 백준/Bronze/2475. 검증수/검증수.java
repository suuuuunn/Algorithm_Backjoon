import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5]; int sum = 0;
		for (int i=0; i<5; i++) {
			arr[i] = s.nextInt();
			sum += arr[i] * arr[i];
		}
		System.out.println(sum % 10);
		
	}
	
}