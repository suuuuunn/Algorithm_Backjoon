import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = br.readLine();
		}
		
		String temp = " ";
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if (s[i].length() > s[j].length()) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				} else if (s[i].length() == s[j].length()) {
					if (s[i].compareTo(s[j]) > 0) {
						temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			}
		}
		
		List<String> list = new ArrayList<String>();
		for (int i=0; i<n-1; i++) {
			if (!s[i].equals(s[i+1])) {
				list.add(s[i]);
			}
		}
		list.add(s[n-1]);
		for (String str : list)  {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	
	}
	
}