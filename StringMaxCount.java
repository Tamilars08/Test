package InterviewQuestions;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringMaxCount {
	public static void main(String[] args) {
		String a = "pakkada kolantha sandu kolantha pakkada";
		char[] charArray = a.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (char c : charArray) {
			if (m.containsKey(c)) {
				Integer in = m.get(c);
				//System.out.println(in);
				m.put(c, in + 1);
			} else {
				m.put(c, 1);
			}

		}
		//System.out.println(m);
	    Collection<Integer> values = m.values();
	    System.out.println(values);
	    Integer max = Collections.max(values);
	    System.out.println(max);
	}

}
