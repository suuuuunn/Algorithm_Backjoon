import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int s[] = new int[22];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "add": add(Integer.parseInt(st.nextToken())); break;
			case "remove": remove(Integer.parseInt(st.nextToken())); break;
			case "check": 
				if (check(Integer.parseInt(st.nextToken())) == 1) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "toggle": toggle(Integer.parseInt(st.nextToken())); break;
			case "all": all(); break;
			case "empty": empty(); break;
			}
		}
		System.out.println(sb);
	}

	private static void empty() {
		for (int i=0; i<s.length; i++) {
			s[i] = 0;
		}
	}

	private static void all() {
		for (int i=1; i<s.length; i++) {
			s[i] = i;
		}
	}

	private static void toggle(int a) {
		if (s[a+1] == 0) {
			s[a+1] = a;
		} else {
			s[a+1] = 0;
		}
	}

	private static int check(int a) {
		if (s[a+1] != 0) {
			return 1;
		} else {
			return 0;
		}
	}

	private static void remove(int a) {
		s[a+1] = 0;
	}

	private static void add(int a) {
		s[a+1] = a;
	}
}
