import java.util.*;

public class TreeMap1{
	
	public static void main(String[] args) {
		TreeMap<String, Integer> vozila = new TreeMap<>();
		
		// Dodavanje nekoliko vozila.
		vozila.put("BMW", 5);
		vozila.put("Mercedes", 3);
		vozila.put("Audi", 4);
		vozila.put("Mazda", 10);
		
		System.out.println("Ukupan broj razlicitih vozila " + vozila.size());
		
		// Vozila su ispisana u sortiranom redoslijedu
		for (String key : vozila.keySet())
			System.out.println(key + " - " + vozila.get(key));
		System.out.println();
		
		Map.Entry<String,Integer> posljednji =  vozila.lastEntry();
		System.out.println("Posljednji element je: " + posljednji);
		
		
		String kljuc = vozila.ceilingKey("Citroen");
		System.out.println("Kljuc najblizi kljucu " + "Citroen koji je veci od njega je: " + kljuc);
		
	}
}