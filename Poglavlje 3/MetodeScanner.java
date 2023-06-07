//uvoz paketa java.util da bi se mogle koristiti metode klase Scanner
import java.util.Scanner; 
public class MetodeScanner{
	public static void main(String[]args){	
		Scanner sken  = new Scanner(System.in);
		int suma = 0;
		double prosjek = 0;
		int brojStudenata = 0;
		int maximalan = 0;
		int polozili = 0;
		
		while(sken.hasNext()){
			
			String ime = sken.next();
			String prezime = sken.next();
			int bodovi = sken.nextInt();
			
			brojStudenata++;
			suma += bodovi;
			if(bodovi > maximalan)
				maximalan = bodovi;
			
			if(bodovi >= 51)
				polozili++;		
		}		
		prosjek = (suma + 0.0) / brojStudenata;
		
		System.out.print("Broj studenata koji su polozili ispit je: ");
		System.out.println(polozili);
		System.out.print("Prosjecan broj osvojenih bodova je: ");
		System.out.println(prosjek);
		System.out.print("Najveci broj osvojenih bodova je: ");
		System.out.println(maximalan);
	}
}