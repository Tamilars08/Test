package InterviewQuestions;

public class Numeric_ACII_value {
	public static void main(String[] args) {
		String s = "Tamil4arasan";
		int t = 0;
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt >= '0' && charAt <= '9') {

				int numericValue = Character.getNumericValue(charAt);
				System.out.println(numericValue);
				t = t + numericValue;

			}

		}
		System.err.println(t);

	}
}