package firstNonRepeatedChar;

import java.util.HashMap;
import java.util.Map;

public class FNRC {

//	public char find(String str) {
//		char[] c = str.toCharArray();
//		for(int i = 0 ; i < str.length() ; i++) {
//			if(i == str.length() - 1 && str.length() != 1)
//				return 0;
//			for(int j = 0 ; j < str.length() ; j ++) {
//				if(i == j || c[i] == ' ') 
//					continue;
//				if(c[i] == c[j])
//					break;			
//				else if(j == str.length() - 1)
//					return c[i];	
//			}
//		}
//		return c[0];
//	}
	
	public char find2(String str) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
			
		for(char ch : chars) {
			int count = hm.containsKey(ch) ? hm.get(ch) : 0;
			hm.put(ch, count + 1);
		}
		
		for(char ch : chars) {
			if(hm.get(ch) == 1)
				return ch;
		}
		return Character.MIN_VALUE;
	}

}
