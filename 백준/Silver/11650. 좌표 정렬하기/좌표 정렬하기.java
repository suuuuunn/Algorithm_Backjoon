import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][2];
		for (int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] =Integer.parseInt(s[0]);
			arr[i][1] =Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
}
