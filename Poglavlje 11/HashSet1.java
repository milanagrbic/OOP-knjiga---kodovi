import java.util.HashSet;
	
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> vozila = new HashSet<String>();
		vozila.add("Volvo");
		vozila.add(null);//moze se ubaciti i null element
		vozila.add("BMW");
		vozila.add("Ford");
		vozila.add("BMW");//ova naredba nece imati efekta, jer je BMW vec ubacen
		vozila.add(null); //ni ova naredba nece imati efekta, jer je null vec ubacen
		System.out.println(vozila);
	}
}