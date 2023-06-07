	import java.util.Scanner;
	
	public class MetodeInteger{
		public static void main(String[]args){
			
			Scanner sken = new Scanner(System.in);
			
			System.out.println("Unesite String koji sadrzi cijeli broj:");
			String s = sken.nextLine();
			
			/*Pretvaranje ucitanog Stringa u podatak tipa int,jer metode 
			*koje vracaju zapise u binarnom, oktalnom i heksadekadnom
			*zapisu za argument uzimaju podatak tipa int*/
			int broj = Integer.parseInt(s);
			System.out.println("Dekadna vrijednost: " + broj);
			
			/*Poziv odgovarajucih metoda i ispis na ekranu*/
			System.out.println("Binarni zapis: " + Integer.toBinaryString(broj));
			System.out.println("Oktalni zapis: " + Integer.toOctalString(broj));
			System.out.println("Heksadekadni zapis: " + Integer.toHexString(broj));		
		}
	}