import java.util.Scanner;
	
public class Sifriraj{
		
	public static String sifriraj(String recenica){
			
		String rez = "";
			
		Scanner sken = new Scanner(recenica);
			
		while(sken.hasNext()){
			rez += sifrirajRijec(sken.next());
			rez += " ";	
		}
			
		return rez;
	}
		
	private static String sifrirajRijec(String r){
			
		String rez = "";
			
		if(pocinjeVelikimSlovom(r))
			rez = sifrirajVeliko(r);
		else if(pocinjeMalimSlovom(r))
			rez = sifrirajMalo(r);
		else
			rez = sifrirajOstalo(r);
			
		return rez;
	}
		
	private static boolean pocinjeVelikimSlovom(String s){
			
		if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
			return true;
		else
			return false;
	}
		
		
	private static String sifrirajVeliko(String r){
			
		String rez = "";
			
		for(int i = 0; i<r.length(); i++)
			rez += sifraV(r.charAt(i));
			
		return rez;	
	}
		
	private static boolean pocinjeMalimSlovom(String s){
			
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
			return true;
		else
			return false;
	}
		
		
	private static String sifrirajMalo(String r){
			
		String rez = "";
			
		for(int i = r.length()-1; i>=0; i--)
			rez += sifraM(r.charAt(i));
			
		return rez;	
	}
		
	private static char sifraV(char c){
			
		char rez = c;
				
		if(c >= 'A' && c <= 'Z')
			if( c + 3 > 'Z')
				rez = (char) ('C' + (c - 'Z'));
			else
				rez = (char)(c + 3);
		
		else if(c >= 'a' && c <= 'z')
			if( c + 3 > 'z')
				rez = (char) ('c' + (c - 'z'));
			else
				rez = (char)(c + 3);
		
		return rez;
	}
	
	private static char sifraM(char c){
			
		char rez = c;
		
		if(c >= 'A' && c <= 'Z')
			if(c - 3 < 'A')
				rez = (char)('X' + (c - 'A'));
			else
				rez = (char)(c - 3);
		
		else if(c >= 'a' && c <= 'z')
			if(c - 3 < 'a')
				rez = (char)('x' + (c-'a'));
			else
				rez = (char)(c - 3);
		
		return rez;
	}
		
	private static String sifrirajOstalo(String r){
			
		if(r.equals("?"))
			return "!";
		else if (r.equals("!"))
			return ".";
		else if(r.equals("."))
			return "?";
		else 
			return r;
	}
}