package _00_intro_to_array_lists;

import java.util.ArrayList;

public class sometrhin {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> Strings = new ArrayList<String>();
		//2. Add five Strings to your list
		Strings.add("thing1");
		Strings.add("thing2");
		Strings.add("thing3");
		Strings.add("thing4");
		Strings.add("thing5");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < Strings.size(); i++) {
			if (i%2==1) {
				System.out.println(Strings.get(i));
			}
			
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		
		
	
	}
}
