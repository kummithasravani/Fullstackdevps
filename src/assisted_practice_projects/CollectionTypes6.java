package assisted_practice_projects;
import java.util.*;
public class CollectionTypes6 {

	public static void main(String[] args) {
		System.out.println("Array List");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Vijayawada");
		city.add("Guntur");
		System.out.println("Array List are"+city);
		city.clear();
		city.add("Sattenapalli");
		System.out.println("After clear Array List is="+city);
	    System.out.println("Vector");
	    Vector<String> vec = new Vector<String>();
	    vec.addElement("Right"); 
	    vec.addElement("left"); 
	    System.out.println("Vector elements are="+vec);
	    System.out.println("LinkedList");
	    LinkedList<String> names=new LinkedList<String>();  
	    names.add("farook");  
	    names.add("idris");  
	    System.out.println("Linked list elements are"+names);
	    Iterator<String> itr=names.iterator();  
	    while(itr.hasNext()){  
	    System.out.println(itr.next());  
	    System.out.println("HashSet");
	    HashSet<Integer> set=new HashSet<Integer>();  
	    set.add(50);  
	    set.add(53);  
	    set.add(62);
	    set.add(64);
	    System.out.println(set);
        System.out.println("LinkedHashSet");
	    LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
        set2.add(15);  
        set2.add(20);  
        set2.add(25);
	    set2.add(30);	       
	    System.out.println(set2);
	   	} 
	}
}


