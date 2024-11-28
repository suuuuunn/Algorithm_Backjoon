import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int k = Integer.parseInt(input.split(" ")[1]);
		
		int arr[] = new int[n];
		
		String input2 = br.readLine();
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input2.split(" ")[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-k]);
	}
	
}