import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int low = (int) Math.round(n * 0.15);
		int sum = 0;
		for (int i = low; i<n-low; i++) {
			sum += arr[i];
		}
		int result =(int) Math.round((double) sum/(n-low*2));
		bw.write(result + " ");
		bw.flush();
	}
	
}