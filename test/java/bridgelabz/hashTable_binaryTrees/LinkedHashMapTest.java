package bridgelabz.hashTable_binaryTrees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedHashMapTest {

	private String paragraph;
	private LinkedHashMap<String, Integer> linkedHashMap;
	private String words[];
	
	@Before
	public void init() {
		paragraph="To be or not to be";
		linkedHashMap = new LinkedHashMap<String, Integer>();
		words = paragraph.toLowerCase().split(" ");
		for(String word: words) {
        	Integer value = linkedHashMap.get(word);
        	if(value==null) 
        		value = 1;
        	else 
        		value = value+1;
        	linkedHashMap.add(word,value);
        }
		linkedHashMap.showMap();
	}
	
	
	@Test
	public void whenAddedSentanceFrequencyOfToIsTwo() {
		assertEquals(3,(int)linkedHashMap.get("to"));
	}
}