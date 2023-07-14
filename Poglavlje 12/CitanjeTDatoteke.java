import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CitanjeTDatoteke{
	
	private Scanner ulaz;
	
	public void otvoriDatoteku(){
		try{
			ulaz = new Scanner(new File( "studenti.txt" ));
		} 
		catch (FileNotFoundException fileNotFoundException){
			System.err.println( "Greska pri otvaranju datoteke: " );
			System.exit(1);
		} 
	} 
	public void procitajPodatke(){
		Student podatak = new Student();
		System.out.printf( "%-10s%-12s%-12s%10s\n", "Broj indeksa","Ime", "Prezime", "Prosjek" );
		
		try{
			while(ulaz.hasNext()){	
				podatak.setBrojIndeksa(ulaz.next()); 
				podatak.setIme(ulaz.next()); 
				podatak.setPrezime(ulaz.next() );
				podatak.setProsjek(ulaz.nextDouble()); 
				
				System.out.printf( "%-12s%-12s%-12s%10.2f\n",
				podatak.getBrojIndeksa(), podatak.getIme(),
				podatak.getPrezime(), podatak.getProsjek());	
			} 
		}catch (NoSuchElementException elementException){
			System.err.println( "Nepravilno formatirana datoteka." );
			ulaz.close();
			System.exit(1);
		}catch (IllegalStateException stateException){
			System.err.println( "Greska prilikom citanja iz datoteke." );
			System.exit(1);
		} 
	} 
	public void zatvoriDatoteku()
	{
		if (ulaz!= null )
		ulaz.close();	
	}
 
} 