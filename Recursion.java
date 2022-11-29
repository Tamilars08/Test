package InterviewQuestions;

public class Recursion {
	public static int findFactoriaal_1(int i) {
		if (i == 0) {
			return 1;
		} else {
			System.err.println(i);
			return i * findFactorial_2(i - 1);
		}

	}

	public static int findFactorial_2(int i) {
		if (i == 0) {
			return 1;
		} else {
			System.err.println(i);
			return i * findFactorial_2(i - 1);
		}

	}

	public static void main(String[] args) {
		System.err.println(findFactoriaal_1(10));
	}
}
