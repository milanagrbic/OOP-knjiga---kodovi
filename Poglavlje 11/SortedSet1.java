import java.util.*;
	
public class SortedSet1 {
	public static void main(String[] args) {
		TreeSet<String> vozila = new TreeSet<String>();
		vozila.add("Volvo");
		vozila.add("Audi");
		vozila.add("BMW");
		vozila.add("Ford");
		vozila.add("Mazda");
	    vozila.add("BMW");//ova naredba nece imati efekta, jer je BMW vec ubacen
		vozila.add("Toyota");
		System.out.println(vozila);
			
		SortedSet vozila2 = vozila.tailSet("Mazda");
		System.out.println(vozila2);
		SortedSet vozila3 = vozila.headSet("Mazda");
		System.out.println(vozila3);
		SortedSet vozila4 = vozila.subSet("BMW","Mazda");
		System.out.println(vozila4);
	}
}