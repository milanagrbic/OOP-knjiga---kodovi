import java.util.Scanner;
	
public class DijeljenjeSaNulom{
		
public static int kolicnik(int brojilac, int imenilac){
			return brojilac/imenilac;
		}
		
		public static void main(String[]args){
			
			Scanner skener = new Scanner(System.in); 
			
			System.out.print("Unesite brojilac: ");
			int brojilac = skener.nextInt();
			System.out.print("Unesite imenilac: ");
			int imenilac = skener.nextInt();
			
			int rez = kolicnik (brojilac,imenilac);
			System.out.printf("\nRezultat: %d / %d = %d\n", brojilac, imenilac, rez);				
		}
	}