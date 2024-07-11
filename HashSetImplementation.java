import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
     
    	//doesn't maintain insertion order allows only one null value since set doesn't allow duplicate
        HashSet<String> hs = new HashSet<>();

        hs.add("A");
        hs.add(null);
        //hs.add(null);
        hs.add("B");
        hs.add("G");
        hs.add("F");
        hs.add("R");
        hs.add("Z");

        // Using iterator() method to iterate over the HashSet
        System.out.print("Using iterator(): ");
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();
        System.out.println("Size of HashSet: " + hs.size());
        
        hs.remove("F");

        // Using enhanced for loop to iterate over the HashSet
        System.out.print("Using enhanced for loop: ");
        for (String element : hs) {
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("Is HashSet Empty: " + hs.isEmpty());
        System.out.println("Size of HashSet: " + hs.size());
        
    }
}
