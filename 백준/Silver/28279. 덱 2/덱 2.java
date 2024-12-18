import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Deque<Integer> deque = new ArrayDeque<>();
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "1": offer_first(Integer.parseInt(st.nextToken())); break;
			case "2": offer_last(Integer.parseInt(st.nextToken())); break;
			case "3": sb.append(first_poll()).append("\n"); break;
			case "4": sb.append(last_poll()).append("\n"); break;
			case "5": sb.append(size()).append("\n"); break;
			case "6": sb.append(isEmpty()).append("\n"); break;
			case "7": sb.append(peek_first()).append("\n"); break;
			case "8": sb.append(peek_last()).append("\n"); break;
			}
		}
		
		System.out.println(sb);
	}
	
	private static void offer_first(int x) {
		deque.offerFirst(x);
	}
	
	private static void offer_last(int x) {
		deque.offerLast(x);
	}
	
	private static int first_poll() {
		if (deque.isEmpty()) return -1;
		else return deque.pollFirst();
	}
	
	private static int last_poll() {
		if (deque.isEmpty()) return -1;
		else return deque.pollLast();
	}

	private static int size() {
		return deque.size();
	}
	
	private static int isEmpty() {
		if (deque.isEmpty()) return 1;
		else return 0;
	}
	
	private static int peek_first() {
		if (deque.isEmpty()) return -1;
		else return deque.peekFirst();
	}
	
	private static int peek_last() {
		if (deque.isEmpty()) return -1;
		else return deque.peekLast();
	}
	
}