import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			int arr[] = new int[3];
			arr[0] = s.nextInt(); arr[1] = s.nextInt(); arr[2] = s.nextInt();
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			int max = 0; int sum = 0;
			for (int i=0; i<3; i++) {
				sum += arr[i] * arr[i];
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			if (max * max == sum - max * max) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
		
	}
	
}