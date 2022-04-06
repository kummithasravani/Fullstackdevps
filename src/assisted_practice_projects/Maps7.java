package assisted_practice_projects;

import java.util.*;

public class Maps7 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"welcom");    
	      hm.put(2,"kummitha");    
	      hm.put(3,"sravani");   
	       
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"hasya");  
	      ht.put(5,"welcom");  
	      ht.put(6,"to");  
	      ht.put(7," house");  

	      System.out.println("The elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	   
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"naveena");    
	      map.put(9,"srinu");    
	      map.put(10,"vali");       
	      
	      System.out.println("The elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}