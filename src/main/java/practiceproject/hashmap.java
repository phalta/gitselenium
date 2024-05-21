package practiceproject;

import java.util.HashMap;
import java.util.Iterator;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> people= new HashMap<String,Integer>();
		people.put("priya", 32);
		people.put("nikhil", 32);
		people.put("prithvi", 2);
		people.put("baba", 63);
		people.put("xxx", 100);
		people.put("hiii", 200);
		System.out.println(people);
		people.size();
		for(String i:people.keySet())
		{
			System.out.println(i);
		}
		for(Integer i:people.values())
		{
			System.out.println(i);
		}
	

	}
}
