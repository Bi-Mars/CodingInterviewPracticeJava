package com.interview.longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Length: " + lengthOfLongestSubstring("ababca") );
		System.out.println("Length: " + longestLengthSubstring("abbabcda") );


	}
	
	public static int lengthOfLongestSubstring(String s) {
		int stringLength= s.length();
		Set<Character> set = new HashSet<>();
		int lengthLongest = 0, i = 0, j = 0;
		
		while(i< stringLength && j < stringLength) {
			// extend the range [i,j]
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				lengthLongest = Math.max(lengthLongest, j-i);
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		return lengthLongest;
	}
	
	public static int longestLengthSubstring(String s) {
		int stringLength = s.length();
		int longestLength = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		// try to extend the range of [i,j]
		for(int j =0, i = 0; j < stringLength; j++) {
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			longestLength = Math.max(longestLength, j-i+1);
			map.put(s.charAt(j),j+1);
		}
		
		return longestLength;
	}

}
