import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		BigInteger fc = new BigInteger("1");
		for (int i=1; i<=n; i++) {
			fc = fc.multiply(BigInteger.valueOf(i));
		}
		String s = fc+ ""; int count = 0;
		if (n >= 5) {
			for (int i=s.length()-1; i>=0; i--) {
				if (s.charAt(i) == '0') {
					count++;
				} else {
					break;
				}
			}
		} else {
			count = 0;
		}
		System.out.println(count);
	}
}