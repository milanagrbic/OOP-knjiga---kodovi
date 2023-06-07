import java.util.*;

public class Kockica{
	public static void main(String[]args){
		
		Random ran = new Random();
		int broj1 = 0, broj2 = 0, broj3 = 0, broj4 = 0, broj5 = 0, 
		broj6 = 0;
		int brojac = 0;
		
		while(brojac < 10000){
			
			int gen = ran.nextInt(6) + 1;
			brojac++;
			
			switch(gen){
				case 1: broj1++; break;
				case 2: broj2++; break;
				case 3: broj3++; break;
				case 4: broj4++; break;
				case 5: broj5++; break;
				case 6: broj6++; break;
			}		
		}	
		System.out.println("Broj 1 je generisan: " + broj1 + " puta");
		System.out.println("Broj 2 je generisan: " + broj2 + " puta");
		System.out.println("Broj 3 je generisan: " + broj3 + " puta");
		System.out.println("Broj 4 je generisan: " + broj4 + " puta");
		System.out.println("Broj 5 je generisan: " + broj5 + " puta");
		System.out.println("Broj 6 je generisan: " + broj6 + " puta");		
	}
}	