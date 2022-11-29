package InterviewQuestions;

public class oddorevenwhile {
	public static void main(String[] args) {
		int a = 1;
//		int oddCount = 0;
//		int evenCount = 0;
//		while (a <= 10) {
//			if (a % 2 == 0) {
//				System.out.println("The given num is EVEN");
//			} else {
//				System.out.println("The given num is ODD");
//			}
//			a++;
//		}

		int oddCount = 0;
		int evenCount = 0;
		int sumEven = 0;
		int sumOdd = 0;
		while (a <= 10) {
			if (a % 2 == 0) {
				sumEven += a;
				evenCount++;

			} else {
				sumOdd += a;
				oddCount++;

			}
			a++;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}

}
