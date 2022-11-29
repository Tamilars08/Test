package InterviewQuestions;

public class ArraySorting {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 7, 8, 2, 3, 4, };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int t = 0;
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;

				}

			}
			System.err.println(a[i]);
		}

	}
}