import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(st.nextToken()); int n = Integer.parseInt(st.nextToken());
		
		boolean flag[] = new boolean[n+1];
		flag[0] = true; flag[1] = true; // 소수아닌거 true
		for (int i=2; i<Math.sqrt(flag.length); i++) {
			for (int j=i*i; j<=n; j+=i) {
				flag[j] = true;
			}
		}
		
		for (int i=m; i<=n; i++) {
			if (flag[i] == false) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	
}