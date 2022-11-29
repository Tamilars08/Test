package InterviewQuestions;

import java.util.Iterator;

public class String_duplicates {
	public static void main(String[] args) {
		String s = new String("Tamail");
		String ouput = new String();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < ouput.length(); j++) {
				if (s.charAt(i) != ouput.charAt(j)) {
					ouput = ouput + s.charAt(i);

				}

			}

		}
		System.out.println(ouput);
	}

}
