import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[3]; int arr2[] = new int[3];
		int count[] = new int[3]; int count2[] = new int[3];
		for (int i=0; i<3; i++) {
			arr[i] = s.nextInt(); arr2[i] = s.nextInt();
		}
		for (int i=0; i<3; i++) {
			if (i == 2 && arr[i] == arr[0]) {
				count[i]++; count[0]++;
			}
			if (i == 2 && arr2[i] == arr2[0]) {
				count2[i]++; count2[0]++;
			}
			if (i != 2 && arr[i] == arr[i+1]) {
				count[i]++; count[i+1]++;
			}
			if (i != 2 && arr2[i] == arr2[i+1]) {
				count2[i]++; count2[i+1]++;
			}
		}
		for (int i=0; i<3; i++) {
			if (count[i] == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		for (int i=0; i<3; i++) {
			if (count2[i] == 0) {
				System.out.println(arr2[i]);
			}
		}
	}
}