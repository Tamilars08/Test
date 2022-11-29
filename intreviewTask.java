package InterviewQuestions;

public class intreviewTask {

	static int solution(int X, int Y, int[] A) {
		int N = A.length;
		int result = -1;
		int nX = 0;
		int nY = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] == X)
				nX += 1;
			else if (A[i] == Y)
				nY += 1;
//			if (nX == nY)
//				result = i;
			 if (nX == nY)
				result = i;
		}
		System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		int A[] = new int[6];
		A[0] = 100;
		A[1] = 63;
		A[2] = 1;
		A[3] = 7;
		A[4] = 2;
		A[5] = 13;

		solution(100,63, A);
	}

}
