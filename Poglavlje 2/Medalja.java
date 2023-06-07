public class Medalja{
	public static void main(String[] args){
		
		//dodjela mjesta takmicaru
		int mjesto = 2;	
		boolean osvojena = false;
		String medalja;
		switch(mjesto){
			case 1: medalja = "zlatnu"; osvojena = true; break;
			case 2: medalja = "srebrnu"; osvojena = true; break;
			case 3: medalja = "bronzanu"; osvojena = true; break;
			default: medalja = "bez medalje";
		}
		
		if(osvojena)
			System.out.println("Takmicar je osvojio: " + medalja + " medalju.");
		else 
			System.out.println("Takmicar je " + medalja + ".");
		
	}
}