import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n]; int p = 0;
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i=0; i<n-1; i++) {
			for (int j=0; j<n-1; j++) {
				if (arr[j] > arr[j+1]) {
					p = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = p;
				}
			}
		}
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}