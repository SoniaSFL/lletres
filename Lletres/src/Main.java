import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		// Fase 1
		
		char[] nameArray = {'S','o','n','i','a'};
		int i;
		for (i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		
		// Fase 2
		
		List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		List<Character> name = new ArrayList<>();
		
		for (i = 0; i < nameArray.length; i++) {
			name.add(nameArray[i]);
		}
		
		for (Character letter : name) {
			letter = Character.toLowerCase(letter);
			if (Character.isLetter(letter) && vowels.contains(letter)) {
				System.out.println("VOCAL");
			} else if (Character.isLetter(letter) && !vowels.contains(letter)) {
				System.out.println("CONSONANT");
			} else if (Character.isDigit(letter)) 			{
				System.out.println("Els noms de persones no contenen números!");
			}
		}
		
		// Fase 3
		
		Map<Character, Integer> nameMap = new HashMap<>();
		for (Character letter : name) {
			letter = Character.toLowerCase(letter);
			if (!nameMap.containsKey(letter)) {
				nameMap.put(letter, 1);
			} else {
				nameMap.replace(letter, nameMap.get(letter) + 1);
			}
		}
		
		// Fase 4
		
		List<Character> surname = new ArrayList<>(Arrays.asList('S','a','n','c','h','e','z'));
		List<Character> fullName = new ArrayList<>();
		fullName.addAll(name);
		fullName.add(' ');
		fullName.addAll(surname);
		
	}

}
