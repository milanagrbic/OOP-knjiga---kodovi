	class testKonstante {
		static final int MAKSIMUM = 100;
		public static void main(String[] args) {
			System.out.println("Maksimum: " + MAKSIMUM); 
			//MAKSIMUM = 200; //nije dozvoljeno
			final int KONSTANTA = 400;//dozvoljeno ali nije preporucljivo
			System.out.println("Druga konstanta: " + KONSTANTA); 
			//KONSTANTA = 200; //nije dozvoljeno
		}
	}