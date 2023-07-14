import java.io.File;
import java.util.*;
import java.util.Scanner; 

public class MetodeFile{
	
	public static void analizirajPutanju(String putanja){
		
		File f = new File(putanja);	
		
		if(f.exists()){
			System.out.println(f.getName());
			if(f.isFile())
			System.out.println(" je datoteka.");
			else
			System.out.println(" nije datoteka.");
			
			if(f.isDirectory()){
				System.out.println(" je direktorijum.");
				String [] lista = f.list();
				System.out.println("Sadrzaj direktorijuma: ");
				for(String naziv : lista)
					System.out.println(naziv);
			}
			else
			System.out.println(" nije direktorijum.");
			
			if(f.isAbsolute())
				System.out.println("Unesena je apsolutna putanja.");
			else
				System.out.println("Nije unesena apsolutna putanja.");
			
			Date d = new Date(f.lastModified());
			System.out.println("Posljednja promjena se desila " + d);
			System.out.println("Duzina " + f.length());
			System.out.println("Putanja " + f.getPath());
			System.out.println("Apsolutna putanja " + f.getAbsolutePath());
		}
		else
		System.out.println("Ne postoji unesena putanja.");
	} 	
		
	public static void main(String[]args){
		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite naziv datoteke ili direktorijuma: ");
		analizirajPutanju(sken.nextLine());	
	}
}