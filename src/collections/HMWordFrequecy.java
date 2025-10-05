package collections;

import java.util.HashMap;

public class HMWordFrequecy {

	public static void main(String[] args) {
		String sentence = "This f is a test this is only a test";
		
		
		HashMap<String, Integer> wordFreqHashMap= new HashMap<>();
		
		String[] stringArray=sentence.toLowerCase().split(" ");
	for(String oneWord: stringArray) {
		
		wordFreqHashMap.put(oneWord, wordFreqHashMap.getOrDefault(oneWord, 0)+1);
	}

	
	wordFreqHashMap.forEach((k, v)-> System.out.println(k+ " " +v));
	}

}
