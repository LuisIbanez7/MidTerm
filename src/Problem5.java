import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Please type in a word with double letters. \n e.g. Letter, Pattle, etc.");
		String str = sn.nextLine();
		String modfiedStr = removeDoubledLetters(str);
		System.out.println(modfiedStr);
	}

	private static String removeDoubledLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 || ch != str.charAt(i - 1)) {
				result += ch;
			}
		}
		return result;
	}
}
