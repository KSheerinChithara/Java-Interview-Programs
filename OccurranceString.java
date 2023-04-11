import java.util.HashMap;

public class OccurranceString {
    public static void main(String[] args) {
        String a = "ksheerinchithara";
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (hashmap.containsKey(ch)) {
                count = hashmap.get(ch);
                count++;
                hashmap.put(ch, count);
            } else {
                hashmap.put(ch, 1);
            }
        }
        System.out.println(hashmap);
        for (Character letter : hashmap.keySet()) {
            if (hashmap.get(letter) >= 2) {
                System.out.println("duplicated values: " + letter);
            } else if (hashmap.get(letter) ==1) {
                System.out.println("Unique values: " + letter);

            }
        }


    }
}