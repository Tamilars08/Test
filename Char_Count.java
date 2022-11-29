package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Char_Count {
	public static void main(String[] args) {
		String s = "Automation Application";
		char[] charArray = s.toCharArray();
		//String string = charArray.toString();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] != ' ') {
				if (map.containsKey(charArray[i])) {
					Integer integer = map.get(charArray[i]);
					map.put(charArray[i], integer + 1);
				} else {
					map.put(charArray[i], 1);
					//System.out.println(charArray[i]);
				}
				
			}else {
				map.put(charArray[i], 1);
			}

		}
		System.err.println(map);

	}
}
