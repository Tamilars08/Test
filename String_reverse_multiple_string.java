package InterviewQuestions;

import java.util.Iterator;

public class String_reverse_multiple_string {
	public static void main(String[] args) {
		String s = "Hi sir am a mad";
		String[] s1 = s.split(" ");
		String e = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.println(s1[i]);
			e = e + s1[i];

		}

	}

}
