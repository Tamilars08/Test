package InterviewQuestions;

public class Prime_or_Not {
	public static void main(String[] args) {
		int a = 13;
		int count = 0;

		if (a > 1) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) 

					count++;
				}
				if (count == 2) {
					System.err.println("It's a Prime Number");
				} else {
					System.err.println("It's Not a Prime Number");
				}

			}

		}
	}
