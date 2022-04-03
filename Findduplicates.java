package dupchar;

public class Findduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "How many duplicates are there?";
		System.out.println(sentence);

		String characters = "";
		String duplicates = "";
		for (int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if (characters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates += current + ",";
				}
			}
			characters += current;
		}

		System.out.println(duplicates);
	}

}
