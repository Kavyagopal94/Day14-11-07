package Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetIMPLI 
{
	public static void main(String[] args) 
	{
		//Maintains insertion order allows only one null value since set doesn't allow duplicate
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(5);
		set.add(3);
		set.add(null);
		//set.add(null);
		set.add(7);
		set.add(1);
		
		System.out.println("The size of set is: " + set.size());
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + ",");
		}
		
		System.out.println();
		
		Object[] array = set.toArray();
		for(Object ele : array)
		{
			System.out.println(ele);
		}
		
	}
   
}
