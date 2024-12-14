import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int[] stack = new int[1000000];
	
	static int size = 0;
	static int back = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (Integer.parseInt(st.nextToken())) {
			case 1: push(Integer.parseInt(st.nextToken())); break;
			case 2: pop(); break;
			case 3: size(); break;
			case 4: empty(); break;
			case 5: top(); break;
			}
		}
		System.out.println(sb);
	}
	
	static void push(Integer x) {
		stack[back] = x;
		size++; back++;
	}
	
	static void pop() {
		if (size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(stack[back-1]).append("\n");
			back--; size--;
		}
	}
	
	static void size() {
		sb.append(size).append("\n");
	}
	
	static void empty() {
		if (size == 0) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}
	
	static void top() {
		if (size == 0) sb.append(-1).append("\n");
		else sb.append(stack[back-1]).append("\n");
	}
	
}