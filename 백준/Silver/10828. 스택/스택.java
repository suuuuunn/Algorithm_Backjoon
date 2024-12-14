import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int[] stack = new int[10000];
	
	static int size = 0;
	static int back = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "top": top(); break;
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