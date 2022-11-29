package InterviewQuestions;

import java.util.Iterator;

public class Remove_Special_Charactor {
	public static void main(String[] args) {

		String s = "Tamil@008";
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && (!Character.isLetter(s.charAt(i)))
					&& (!Character.isWhitespace(s.charAt(i)))) {
				temp++;

			}
		}
		if (temp == 0) {
			System.out.println("NotFound");
		} else {
			System.out.println("Spl Char Fount =" + temp);
		}

	}
}