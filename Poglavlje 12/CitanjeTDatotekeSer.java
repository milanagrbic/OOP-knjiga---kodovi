import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CitanjeTDatotekeSer{	
	private ObjectInputStream ulaz;
	
	public void otvoriDatoteku(){
		try{
			ulaz = new ObjectInputStream(new FileInputStream( "studenti.ser" ));
		}catch (IOException ioexception){
			System.err.println( "Greska pri otvaranju datoteke. " );
		} 
	} 

	public void procitajPodatke(){
		StudentSer podatak;
		System.out.printf( "%-10s%-12s%-12s%10s\n", "Broj indeksa","Ime", "Prezime", "Prosjek" );
		
		try{
			while(true){
				
				podatak = (StudentSer)ulaz.readObject();
				
				System.out.printf( "%-12s%-12s%-12s%10.2f\n",
				podatak.getBrojIndeksa(), podatak.getIme(),
				podatak.getPrezime(), podatak.getProsjek());
				
			} 
		}catch (EOFException endOfFileException){
			return;
		}catch (ClassNotFoundException classNotFoundException){
			System.err.println( "Nije moguce kreirati objekat." );
		}catch (IOException ioException){
			System.err.println( "Greska prilikom citanja iz datoteke." );
		} 
	} 
	
	public void zatvoriDatoteku(){
		try{
			if (ulaz != null )
				ulaz.close();
		}catch (IOException ioException){
			System.err.println( "Greska prilikom zatvaranja datoteke." );
			System.exit(1);
		} 
	} 
} 
