package InterviewQuestions;

public class moscow {
	public static void main(String[] args) {

//		String s = "moscow";
//		String output = " ";
//		int count = 0;
////		          1           2          
//		for (int i = 0; i < s.length(); i++) {
////		               3	
//			char c = s.charAt(i);
////                4			
//			if (c == 'o') {
////			      4.1	
//				count++;
////                       4.2 		4.3     4.5     		
//				for (int j = 0; j < count; j++) {
////                           4.4					
//					output = output + '$';
//				}
////             5
//			} else {
//				output = output + c;
//
//			}
//
//		}
//		System.out.println(output);

		String s = "Tamil";
		String output = " ";
		int t = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'm') {
				t++;
				for (int j = 0; j < t; j++) {
					output = output + '@';
				}

			} else {
				output = output + c;
			}

		}
		 System.out.println(output);
	}
}