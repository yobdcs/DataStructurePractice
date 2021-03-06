package firstRepeatedChar;

import java.util.HashSet;
import java.util.Set;

public class FRC {

	private Set<Character> s;
	
	public char find(String str) {
		
		s = new HashSet<Character>();

		for (char c : str.toCharArray()) {
			if(s.contains(c))
				return c;
			s.add(c);
		}
		return Character.MIN_VALUE;
	}
	
	@Override
	public String toString() {
		if(s == null)
			throw new IllegalStateException();
		return s.toString();		
	}

	

}
