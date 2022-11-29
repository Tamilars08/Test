package InterviewQuestions;

public class rowtocoloumn {
	public static void main(String[] args) {
// input		output
//1  1  1 		1  2  3
//2  2  2 		1  2  3
//3  3  3 		1  2  3
		// r c
		int[][] a = {
				// columns
				// 1 2 3
				{ 1, 1, 1 }, // row1
				{ 2, 2, 2 }, // row2
				{ 3, 3, 3 }// row3
		};

		int[][] result = new int[3][3];
		// default value 0
		// 0 0 0
		// 0 0 0
		// 0 0 0
//to interchange the values in array
//                1         2	       7
		for (int i = 0; i < a.length; i++) {// a array iterration

//                  3           4          6
			for (int j = 0; j < a.length; j++) {// result array iteration
//					5
				result[j][i] += a[i][j];
			}
		}
// iterating the array
		for (int[] a1 : result) {
			for (int b : a1) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}