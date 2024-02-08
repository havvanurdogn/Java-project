package DataStrucW5;

import java.util.HashMap;

public class SimpleHashTable {

	public static void main(String[] args) {
		HashMap<String, Integer> hashTable = new HashMap<String, Integer>();
		hashTable.put("apple", 5);
		hashTable.put("banana", 10);
		hashTable.put("cherry", 15);
		
		int appleValue = hashTable.get("apple");
		int bananaValue = hashTable.get("banana");
		int cherryValue = hashTable.get("cherry");
		
		System.out.println("Value for apple : " + appleValue);
		System.out.println("Value for banana : " + bananaValue);
		System.out.println("Value for cherry : " + cherryValue);
		
		boolean hasGrapes = hashTable.containsKey("grapes");
		boolean hasCherry = hashTable.containsKey("cherry");
		
		System.out.println("Does the hash table have 'grapes' ? " + hasGrapes);
		System.out.println("Does the hash table have 'cherry' ? " + hasCherry);
		
		hashTable.remove("banana");
		
		boolean hasBanana = hashTable.containsKey("banana");
		System.out.println("Does the hash table have 'banana' after remove ? " + hasBanana);
		
		
		
	}

}
