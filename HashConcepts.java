package hashmap;

import java.util.HashMap;

public class HashConcepts {
	public static void main(String[] args) {

	HashMap<String, Integer> hashmap = new 	HashMap<String, Integer>();
    hashmap.put("a", 1);
    hashmap.put("b", 2);
    System.out.println(hashmap);
    System.out.println(hashmap.keySet());
    System.out.println(hashmap.get("a"));
    System.out.println(hashmap.isEmpty());
   hashmap.replace("a",4);
   System.out.println(hashmap.get("a"));
   hashmap.replace("a",1);
   System.out.println(hashmap.get("a"));


   


    


    
    


}
}
