import java.util.Scanner;
	
public class SifrirajTest{
		
	public static void main(String [] args){
			
		Scanner sken = new Scanner(System.in);
			
		String recenica, rezultat, sljedeca;
			
		do{
			System.out.println("Unesite recenicu:");
			recenica = sken.nextLine();
				
			rezultat = Sifriraj.sifriraj(recenica);
			System.out.println("Sifrirana recenica je: ");
			System.out.println(rezultat);
				
			System.out.println("Da li zelite da unesete sljedecu recenicu?");
			sljedeca = sken.nextLine();		
				
		}while(sljedeca.equalsIgnoreCase("da"));		
	}
}