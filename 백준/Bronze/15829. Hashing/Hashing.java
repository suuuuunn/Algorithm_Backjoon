import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		long sum = 0; long r = 1; int p = 1234567891;
		for (int i=0; i<n; i++) {
			sum += ((str.charAt(i)-'a' + 1)*r)%p;
			r = (31*r)%p;
		}
		
		System.out.println(sum%p);
	}

}
