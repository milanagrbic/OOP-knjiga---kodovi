public class ZakljucivanjeTipa {
	
	public static void main(String[] args) {
		//zakljucivanje o tipu   
		Kutija<Integer> kutijaBrojeva = new Kutija<>();
		
		//upozorenje za neprovjerenu konverziju
		Kutija kutijaStringova = new Kutija();
		
		kutijaBrojeva.set(10);
		kutijaStringova.set(new String("Zdravo svijete"));
		
		System.out.printf("Vrijednost broja :%d\n", kutijaBrojeva.get());
		System.out.printf("Vrijednost Stringa :%s\n", kutijaStringova.get());
	}
}