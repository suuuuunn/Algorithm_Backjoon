import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int mul = 1;
		for (int i=0; i<k; i++) {
			mul *= (n-i);
		}
		for (int i=1; i<=k; i++) {
			mul /= i;
		}
		System.out.println(mul);
	}

}