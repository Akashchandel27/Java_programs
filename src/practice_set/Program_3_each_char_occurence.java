package practice_set;

import java.util.HashMap;

public class Program_3_each_char_occurence {

	public static void main(String[] args) {

		
String s1 = "akash chandel";

		HashMap<Character, Integer> map = new HashMap<>();

		char charArray[] = s1.toCharArray();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				System.out.println("1 line :" + c);

				map.put(c, map.get(c) + 1);
				System.out.println("2 line :" + c);
			} else {
				map.put(c, 1);

				System.out.println("3 line :" + c);
			}
		}
		System.out.println(map);
	}

}
