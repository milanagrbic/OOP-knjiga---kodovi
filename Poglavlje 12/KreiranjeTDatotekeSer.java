import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
	
public class KreiranjeTDatotekeSer{
		
	private ObjectOutputStream izlaz;
		
	public void otvoriDatoteku(){
		try{
			izlaz = new ObjectOutputStream(new FileOutputStream ("studenti.ser" ));
		}
		catch (IOException ioException){
			System.err.println("Greska pri otvaranju datoteke." );
			System.exit(1); 
		} 
	}
	
	public void dodajPodatke(){
			
		StudentSer podatak;
		String brojIndeksa, ime, prezime;
		double prosjek;
	
		Scanner sken = new Scanner(System.in);
		System.out.println("Za kraj unosa pritisnite Ctrl+Z");
		System.out.println("Unesite broj indeksa, ime, prezime i prosjek");
		
		while(sken.hasNext()){	
			try{
				brojIndeksa = sken.next();
				ime = sken.next();
				prezime = sken.next();
				prosjek = sken.nextDouble();
					
				if(prosjek >= 6){
					podatak = new StudentSer(brojIndeksa, ime, prezime, prosjek);
					izlaz.writeObject(podatak);			
				}
				else{
					System.out.println("Prosjek mora biti veci ili jednak od 6.");
				}
				}catch(IOException ioException){
					System.out.println("Greska pri pisanju u datoteku.");
					return;
				}catch (NoSuchElementException elementException){
					System.err.println( "Pogresan unos. Pokusajte ponovo." );
					sken.nextLine(); 
				} 
				System.out.println("Unesite broj indeksa, ime, prezime i prosjek");
		} 
	}
		
	public void zatvoriDatoteku(){
			
		try{
			if(izlaz != null)
				izlaz.close();
			}catch(IOException ioException){
				System.out.println("Greska pri zatvaranju datoteke.");
				System.exit(1);
				return;
			}
	}
}