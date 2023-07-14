import java.util.*;

public class Stek1 {
	public static int provjera(String s) {
		if(s.length() % 2 != 0) return 0;  //ako je ukupan broj karaktera neparan, uslov sigurno nije zadovoljen
		
		ArrayDeque<Character>  stekKaraktera = new ArrayDeque<>();
		
		for(int i=0; i<s.length(); i++) {
			
			char trenutni = s.charAt(i);
			if(otvorenaZagrada(trenutni)) {
				stekKaraktera.offerLast(trenutni);
			}
			else {
				//dodavanje zatvorene zagrade u prazan stek sigurno dovodi do neispunjenja uslova
				if(stekKaraktera.isEmpty()) {
					return 0;
				}
				char karakterSaSteka = stekKaraktera.pollLast();
				if(isteZagrade(karakterSaSteka, trenutni)) {
					continue;
				}
				else return 0;
			}
		}
		if(stekKaraktera.isEmpty()) return 1;
		
		return 0;
	}
	
	static boolean  otvorenaZagrada(char pC) {
		if(pC == '[' || pC == '(' || pC == '{') {
				return true;
			}
			return false;
		}
		
		static boolean  isteZagrade(char pC1, char pC2) {
			if(pC1 == '[' && pC2 == ']') return true;
			if(pC1 == '(' && pC2 == ')') return true;
			if(pC1 == '{' && pC2 == '}') return true;
			
			return false;
		}
		public static void main(String[] args){
			
			String s = "{[(){([])}()]}";
			if(provjera(s) == 1)
				System.out.println("Uslov je zadovoljen");
			else
				System.out.println("Uslov nije zadovoljen");
		}		
		
	}