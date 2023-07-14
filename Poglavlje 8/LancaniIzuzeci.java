	public class LancaniIzuzeci{
		
		public static void metoda1() throws Exception {
			try{
				metoda2();
			}
			catch(Exception izuzetak){
				throw new Exception( "Izuzetak u metodi 1", izuzetak );
			}
		}
		
		public static void metoda2() throws Exception {
			try{
				metoda3();
			} 
			catch(Exception izuzetak){
				throw new Exception( "Izuzetak u metodi 2", izuzetak);
			}
		}
		
		public static void metoda3() throws Exception{			
			throw new Exception( "Izuzetak u metodi 3" );		
		}
		
		public static void main( String[] args ){
			try{
				metoda1();
			}
			catch(Exception izuzetak){
				izuzetak.printStackTrace();
			} 
		}
	}