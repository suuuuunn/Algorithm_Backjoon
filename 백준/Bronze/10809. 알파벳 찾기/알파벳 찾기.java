import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next() + "";
		String alpha[] = new String[26];
		int index[] = new int[26];
		
		char a = 'a';
		for (int i=0; i<26; i++) {
			alpha[i] = String.valueOf(a);
			a++;
		}
		
		for (int i=0; i<26; i++) {
			index[i] = str.indexOf(alpha[i]);
			System.out.print(index[i] + " ");
		}
	}
	
}