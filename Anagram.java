package InterviewQuestions;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Tamil";
		String s2 = "Simbu";

		String lowerCase1 = s1.toLowerCase();
		String lowerCase2 = s2.toLowerCase();

		if (lowerCase1.length() == lowerCase2.length()) {
			char[] c1 = lowerCase1.toCharArray();
			char[] c2 = lowerCase2.toCharArray();

//			Arrays.sort(c1);
//			Arrays.sort(c2);

			for (int i = 0; i < c2.length; i++) {
				for (int j = i + 1; j < c2.length; j++) {
					char t = 0;
					if (c2[i] > c2[j]) {
						t = c2[i];
						c2[i] = c2[j];
						c2[j] = t;

					}
					for (int k = 0; k < c1.length; k++) {
						for (int o = i + 1; o < c1.length; o++) {
							char t1 = 0;
							if (c1[i] > c1[j]) {
								t = c1[i];
								c1[i] = c1[j];
								c1[j] = t1;

							}

						}

					}
				}
			}
			if (c1 == c2) {
				System.err.println("Anagram");
			} else {
				System.err.println("Not a Anagram");
			}
		} else {
			System.err.println("This is not a Anagram");
		}

	}
}