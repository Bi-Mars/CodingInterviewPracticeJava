package com.interview.nonrepeatingcharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonRepeating("aabdcabdece"));

	}

	public static Character nonRepeating(String word) {
		Character nonRepeat = ' ';
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		//fill the HashMap with character and their frequency
		for(Character c : word.toCharArray()) {
			Integer frequency = hMap.get(c);
			
			if(frequency != null ) {
				hMap.put(c, frequency + 1);
			}
			else {
				hMap.put(c, 1);
			}
		}
		
		//Traverse through hashMap
		for(Entry<Character, Integer> entrySet : hMap.entrySet()) {
			if(entrySet.getValue() == 1) {
				nonRepeat = entrySet.getKey();
				break;
			}
		}
		
		return nonRepeat;
		
	}
}
