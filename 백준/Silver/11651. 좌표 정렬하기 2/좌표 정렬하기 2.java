import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][2];
		for (int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] =  Integer.parseInt(s[0]);
			arr[i][1] =  Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if (e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<2; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
}