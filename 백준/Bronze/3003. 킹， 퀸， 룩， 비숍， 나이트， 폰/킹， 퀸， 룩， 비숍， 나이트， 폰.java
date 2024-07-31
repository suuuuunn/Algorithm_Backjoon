import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int chess[] = {1, 1, 2, 2, 2, 8};
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for (int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<6; i++) {
			System.out.print(chess[i] - arr[i] + " ");
		}
		
	}
	
}