package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Remove_Duplicates_Array {
	public static void main(String[] args) {
//		String s = "Tamiltam";
//		char[] charArray = s.toCharArray();
//		List<Character> li = new ArrayList<>();
//		for (int i = 0; i < charArray.length; i++) {
//			if (li.contains(charArray[i])) {
//				//li.contains(charArray[i]);
//				//continue;
//				li.add(charArray[i]);
//				
//			} else {
//				li.add(charArray[i]);
//			}
//
//		}
		// System.err.println(li);
//		 String a = "Love";  
//	        String b = "You";  
//	        System.out.println("Before swap: " + a + " " + b);  
//	        a = a + b;  
//	        System.out.println(a);
//	        b = a.substring(0, a.length() - b.length());  
//	        System.out.println(b);
//	        a = a.substring(b.length()); 
//	        System.out.println(a);
//	        System.out.println("After : " + a + " " + b);  
//	        System.err.println(a);

		String a = new String("Taamil");
		String b = new String();
		char[] c = a.toCharArray();
		char[] c1 = b.toCharArray();

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c[i] != c1[j]) {

					b = b + c[i];

				}

			}

		}
		System.out.println(b);

	}

}
