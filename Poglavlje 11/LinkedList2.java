import java.util.*;  
public class LinkedList2{  
	public static void main(String args[]){  
		
		LinkedList<String> ll = new LinkedList<String>();  
		ll.add("Prvi");  
		ll.add("Drugi");  
		ll.add("Treci");  
		//pristup elementima u obrnutom redoslijedu
		Iterator i = ll.descendingIterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  
		
	}  
}  