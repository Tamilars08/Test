package InterviewQuestions;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 2, 4, };
		int t = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;

				}

			}
			System.out.println(a[i]);
		}
          System.out.println("sec large" + a[2]);
	}

}
