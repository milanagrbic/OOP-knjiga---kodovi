import java.util.Scanner;

public class MetodeString{
	public static void main(String[]args){
		
		Scanner skener = new Scanner(System.in);
		
		//promjenljive za cuvanje unosa linije i potrebna prebrojavanja
		String unos;
		int viseOd3 = 0;
		int brojKompanija = 0;
		
		System.out.println("Unesite prvu liniju");
		unos = skener.nextLine();
		
		while(!unos.equalsIgnoreCase("kraj")){ //unos se ponavlja dok se ne unese kraj, KRAJ, Kraj...
			
			/*Ako nije uneseno kraj, onda je procitana validna linija i 
			*broj kompanija treba povecati za 1*/
			brojKompanija++; 
			
			/*Izdvajanje sifre, koja je zapravo podstring koji pocinje na 
			*indeksu 0 i duzine je 3,a zatim modifikacija izdvojenog 
			*podstringa tako sto se mala slova pretvaraju u velika*/
			String sifra = (unos.substring(0,3)).toUpperCase();
			
			/*Izdvajanje podstringa koji sadrzi informaciju o broju poena, 
			*taj podstring pocinje na indeku 4 i zavrsava se posljednjim 
			*karakterom unosa*/
			String poeni = unos.substring(4);
			
			/*Broj osvojenih poena je jednak duzini Stringa poeni, pa ako 
			*je duzina Stringa poeni veca ili jednaka 3, onda broj 
			*kompanija koje su osvojile vise od 3 poena treba uvecati*/
			if(poeni.length() >= 3)
				viseOd3++;
			
			//Ispis korektnog zapisa	
			System.out.println(sifra+" je osvojila "+poeni.length()+" poena");
			
			//Unos sljedece linije
			System.out.println("Unesite sljedecu liniju");
			unos = skener.nextLine();								
		}
		//Ispis potrebnih informacija
		System.out.println("Na tenderu je ucestvovalo "+brojKompanija+" kompanija.");
		System.out.println("Kompanija koje su osvojile najmanje 3 poena ima: "+viseOd3);
	}
}