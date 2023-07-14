public class LokalnaKlasa{
	
	private String [] imena = {"Marko", "Petar", "Ana"};
	
	public void poruka(){
		
	
	
		class Poruka{
		
			public static final String pocetak = "Zdravo ";
			public String ime;
			
			Poruka(String s){
				ime = s;
			}
			
			public void pozdrav (){
				System.out.println(pocetak+" "+ime);
						
			}		
		}
		
		for(int i=0; i<imena.length;i++){
			
		Poruka p = new Poruka(imena[i]);
		p.pozdrav();
		
		}	
	
	}
		
		
	public static void main (String [] args){
	
		LokalnaKlasa lk = new LokalnaKlasa();
		lk.poruka();
	
	}
}