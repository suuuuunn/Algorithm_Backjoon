import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5]; int p = 0; int sum = 0;
		
		for (int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				if (arr[j] > arr[j+1]) {
					p = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = p;
				}
			}
		}
		
		System.out.println(sum / 5);
		System.out.println(arr[2]);
	}
	
}
