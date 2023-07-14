public class TestPlati{
	public static void main(String [] args){
		
		Radnik [] spisak = new Radnik [4];
		
		spisak[0] = new Volonter("Marko","Markovic", "065123456");
		spisak[1] = new Direktor("Petar", "Petrovic", "065456789", "001-107-256",2582.56);
		spisak[2] = new Zaposlen("Ana", "Anicic", "065789123", "002-107-356", 1478.23);
		spisak[3] = new ZaposlenPoSatu("Nikola", "Nikolic", "065147258", "003-107-456", 11.25);
		
		
		((Direktor)spisak[1]).dodajBonus(500.00);
		((ZaposlenPoSatu)spisak[3]).dodajSate(40);
		
		
		double iznos;
		
		for (int i=0; i < spisak.length; i++){
			System.out.println(spisak[i]);
			iznos = spisak[i].plati(); 
			if (iznos == 0.0)
			System.out.println("Hvala!");
			else
			System.out.println("Placeno: " + iznos);
			System.out.println("-----------------------------------");
		}
	}
}