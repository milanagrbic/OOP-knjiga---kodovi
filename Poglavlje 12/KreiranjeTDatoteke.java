import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class KreiranjeTDatoteke{
	
	private Formatter izlaz;
	
	public void otvoriDatoteku(){
		try{
			izlaz = new Formatter( "studenti.txt" );
		}
		catch (SecurityException securityException){
			System.err.println("Nemate prava pristupa za pisanje po ovoj datoteci." );
			System.exit(1); 
		} 
		catch (FileNotFoundException fileNotFoundException){
			System.err.println( "Greska pri otvaranju ili kreiranju datoteke." );
			System.exit(1);
		} 
	}
	public void dodajPodatke(){
		
		Student podatak = new Student();
		Scanner sken = new Scanner(System.in);
		System.out.println("Za kraj unosa pritisnite Ctrl+Z");
		System.out.println("Unesite broj indeksa, ime, prezime i prosjek");		
		while(sken.hasNext()){		
			try{
				podatak.setBrojIndeksa(sken.next());
				podatak.setIme(sken.next());
				podatak.setPrezime(sken.next());
				podatak.setProsjek(sken.nextDouble());
				
				if(podatak.getProsjek()>=6)
					izlaz.format("%s %s %s %.2f\n", podatak.getBrojIndeksa(), podatak.getIme(), podatak.getPrezime(), podatak.getProsjek());
					
				else
					System.out.println("Prosjek mora biti veci ili jednak od 6.");
				
			}
			catch (FormatterClosedException formatterClosedException){
				System.err.println( "Greska pri pisanju u datoteku." );
				return;
			}
			catch (NoSuchElementException elementException){
				System.err.println( "Pogresan unos. Pokusajte ponovo." );
				sken.nextLine(); 
			} 
			System.out.println("Unesite broj indeksa, ime, prezime i prosjek");
		} 	
	}
	
	public void zatvoriDatoteku(){
		if(izlaz != null)
		izlaz.close();
	}
}