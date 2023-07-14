	interface VisokoLetenje{
		public void poleti();//povratni tip void
		public void poletiVisoko();	
	}
	interface NiskoLetenje{
		public void poleti(); //povratni tip void
		//public int poleti();//nije dozvoljeno
		public void poletiNisko();
	}
	interface Letenje extends VisokoLetenje, NiskoLetenje{
		
		//public int poleti();
	}
	
	class Patka implements Letenje{
		public void poleti(){
			System.out.println("Patka leti...");
		}
		public void poletiNisko(){
			System.out.println("Patka leti nisko...");
		}
		public void poletiVisoko(){
			System.out.println("Patka leti visoko...");
		}
		
	}
	
	public class NasljedjivanjeInterfejsa{
		
		public static void main(String[] args){
			Patka pata = new Patka();
			pata.poleti();
			
		}
	}