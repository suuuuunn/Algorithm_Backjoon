import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		String s = "";
		s += a;
		s += b;
		
		System.out.println(a+b-c);
		System.out.println(Integer.parseInt(s) -c);
	}
	
}
