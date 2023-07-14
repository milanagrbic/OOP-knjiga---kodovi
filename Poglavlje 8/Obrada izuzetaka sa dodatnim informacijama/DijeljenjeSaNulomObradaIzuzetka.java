import java.util.Scanner;
import java.util.InputMismatchException;

public class DijeljenjeSaNulomObradaIzuzetka{
	
	public static int kolicnik(int brojilac, int imenilac){
		return brojilac / imenilac;
	}
	
	public static void main(String[]args){
		
		Scanner skener = new Scanner(System.in); 
		boolean uspjeh = false;
		
		do{
			
			try{
				System.out.print( "Unesite brojilac: " );
				int brojilac = skener.nextInt();
				System.out.print( "Unesite imenilac: " );
				int imenilac = skener.nextInt();
				
				int rez = kolicnik (brojilac,imenilac);
				System.out.printf("\nRezultat: %d / %d = %d\n", brojilac, imenilac, rez);
				uspjeh = true;
			}
			
			catch(InputMismatchException pogresanUlaz){
				System.err.printf( "\nIzuzetak: %s\n", pogresanUlaz);
				System.out.println(pogresanUlaz.getMessage());
				pogresanUlaz.printStackTrace();
				skener.nextLine(); // odbaciti trenutni unos kako bi korisnik mogao da pokusa ponovo
				System.out.println("Potrebno je unijeti broj. Pokusajte ponovo.\n" );
			}
	
			catch (ArithmeticException aritmetickiIzuzetak){
				System.err.printf("\nIzuzetak: %s\n", aritmetickiIzuzetak);
				System.out.println(aritmetickiIzuzetak.getMessage());
				aritmetickiIzuzetak.printStackTrace();
				System.out.println("Nije dozvoljeno dijeljenje sa nulom. Pokusajte ponovo.\n" );
		} 
			
		}while(!uspjeh);				
	}
}