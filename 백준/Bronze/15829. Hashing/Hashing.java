import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i=0; i<n; i++) {
			int a = str.charAt(i) - 'a' + 1;
			sum += a * Math.pow(31, i);
		}
		System.out.println(sum % 1234567891);
		
	}

}