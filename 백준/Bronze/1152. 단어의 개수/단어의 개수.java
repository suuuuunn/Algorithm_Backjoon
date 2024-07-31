import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String words = sc.nextLine();
		sc.close();
		
		StringTokenizer word = new StringTokenizer(words, " ");
		System.out.println(word.countTokens());
	}
	
}
