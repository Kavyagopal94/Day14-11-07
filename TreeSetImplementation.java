package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementaion 
{
	public static void main(String[] args)
    {
		//Sorted set ascending order by default doesn't allows null value since it implements comparable interface for natural sorting 
        TreeSet<Integer> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add(921);
        ts.add(874);
        //ts.add(null); (Throws nullPointerException)
        ts.add(895);

        // Check if the above Integer exists in the TreeSet or not
        System.out.println("Contains 59: " + ts.contains(59));

        // Print the first element in the TreeSet
        System.out.println("First Value " + ts.first());

        // Print the last element in the TreeSet
        System.out.println("Last Value " + ts.last());

        // Find the values just greater and smaller than the above string
        System.out.println("Higher " + ts.higher(900));
        System.out.println("Lower " + ts.lower(895));
        
        System.out.println("The size of TreeSet is: " + ts.size());
        
        System.out.println("Is TreeSet empty or not: " + ts.isEmpty());
        
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        
        System.out.println();
        
        Object[] array = ts.toArray();

        for (Object element : array) {
            System.out.println(element);
        }
    }
}
