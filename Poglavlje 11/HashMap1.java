import java.util.*;

public class HashMap1{
	
	public static void main(String[] args) {
		Map<String, Integer> vozila = new HashMap<>();
		
		// Dodavanje nekoliko vozila
		vozila.put("BMW", 5);
		vozila.put("Mercedes", 3);
		vozila.put("Audi", 4);
		vozila.put("Mazda", 10);
		
		System.out.println("Ukupan broj razlicitih vozila " + vozila.size());
		
		// Iteriranje po vozilima upotrebom keySet() metode
		for (String key : vozila.keySet())
			System.out.println(key + " - " + vozila.get(key));
		System.out.println();
		
		String searchKey = "Audi";
		if (vozila.containsKey(searchKey))
			System.out.println("Ukupno " + vozila.get(searchKey) + " " + searchKey + " vozila!");
		
		// brisanje vozila iz kolekcije
		vozila.clear();
		
		// provjera velicine kolekcije
		System.out.println("Nakon brisanja broj vozila je " + vozila.size());
	}
}