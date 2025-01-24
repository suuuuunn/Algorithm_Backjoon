import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "add": 
				a = a | (1 << Integer.parseInt(st.nextToken())); 
				break;
			case "remove": 
				a = a & ~(1 << Integer.parseInt(st.nextToken()));
				break;
			case "check": 
				if ((1 << Integer.parseInt(st.nextToken()) & a) > 0) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "toggle": 
				int m = Integer.parseInt(st.nextToken());
				if ((1 << m & a) > 0) {
					a = a & ~(1 << m);
				} else {
					a = a | (1 << m);
				}
				break;
			case "all": 
				a = a | (1 << 21) - 1;
				break;
			case "empty":
				a = 0;
				break;
			}
		}
		System.out.println(sb);
	}

}