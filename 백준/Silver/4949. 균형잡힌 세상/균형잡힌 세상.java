import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		while (true) {
			String dot = br.readLine();
			if (dot.equals(".")) break;
			if (balance(dot)) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static boolean balance(String dot) {
		Stack<Character> stack = new Stack<>();
		for (char c: dot.toCharArray()) {
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.size() == 0 || stack.pop() != '(') {
					return false;
				}
			} else if (c == ']') {
				if (stack.size() == 0 || stack.pop() != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}