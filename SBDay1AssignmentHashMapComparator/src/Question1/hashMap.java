package Question1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		HashMap<String, String> hashmap = new HashMap<>();
		System.out.println("Add 5 Indian States and their capitals into Hashmap");
		int count = 1;
		while (count <= 5) {
			System.out.println("Add into the Hashmap: ");
			hashmap.put(keyboard.next(), keyboard.next());
			System.out.println("Added " + count + " Indian State and its capital into the Hashmap");
			count++;
		}
		
		System.out.println(hashmap);
		
		/*----------------------- Generate all the Keys of the HashMap *-----------------------*/
		System.out.println("Getting all the keys");
        Set<String> keys = hashmap.keySet();
        
        for(String x:keys){
            System.out.println(x);
        }
        System.out.println("=================");
        
        /* Output:
        =================
        Getting all the keys
        Shreya
        Assam
        Manipur
        Megh
        Shaswati
        =================
        */
        
        /*----------------------- Generate all the Values of the HashMap *-----------------------*/
        System.out.println("Getting all the values");
        Collection<String> values= hashmap.values();
        
        for(String value:values){
            System.out.println(value);
        }
        System.out.println("=================");
        
        /* Output:
        =================
 		Getting all the values
        Bhattacharya
        Dispur
        Imphal
        Shillong
        Das
        =================
        */
        
        /*----------------------- Generate Both the Keys & Values of the HashMap *-----------------------*/
        System.out.println("Getting both key and values");
        
        Set<Entry<String, String>>  keyValue = hashmap.entrySet();
        
        for(Entry<String, String> me: keyValue){
            System.out.println(me.getKey()+"======"+me.getValue());
        }
        
        /* Output:
        =================
      	Getting both key and values
        Shreya======Bhattacharya
        Assam======Dispur
        Manipur======Imphal
        Megh======Shillong
        Shaswati======Das
        =================
        */
       
}

	}


