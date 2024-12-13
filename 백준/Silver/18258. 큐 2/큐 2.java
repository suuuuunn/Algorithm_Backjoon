import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int que[] = new int[2000000];
	static StringBuilder sb = new StringBuilder();
	
	static int size = 0;
	static int front = 0;
	static int back = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "front": front(); break;
			case "back": back(); break;
			}
		}
		System.out.println(sb);
	}

	static void push(Integer x) {
		size++;
		que[back] = x;
		back++;
	}
	
	static void pop() {
		if (size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(que[front]).append("\n");
			size--;
			front++;
		}
	}
	
	static void size() {
		sb.append(size).append("\n");
	}
	
	static void empty() {
		if (size == 0) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}
	
	static void front() {
		if (size == 0) sb.append(-1).append("\n");
		else sb.append(que[front]).append("\n");
	}
	
	static void back() {
		if (size == 0) sb.append(-1).append("\n");
		else sb.append(que[back - 1]).append("\n");
	}
	
}