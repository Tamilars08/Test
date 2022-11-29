package InterviewQuestions;

public class Armstrong {
	public static void main(String[] args) {
		int a = 400;
		int rem = 0;
		int sum = 0;
		int b = a;
		while (b > 0) {
//			rem = b % 10;
//			sum = sum + (rem * rem * rem);
//			b = b / 10;
//		}
//		if (sum == a) {
//			System.err.println("Armstrong Number");
//		} else {
//			System.err.println("Not a Armstrong");
//		}
			for (int i = b; i > 0;) {
				rem = b % 10;
				sum = sum + (rem * rem * rem);
				b = b / 10;
			    i = b;
			}
			if (sum == a) {
				System.err.println("Armstrong Number");
			} else {
				System.err.println("Not a Armstrong");
			}

		}
	}

}
