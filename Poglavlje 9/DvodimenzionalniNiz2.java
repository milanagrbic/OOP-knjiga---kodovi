public class DvodimenzionalniNiz2{
	public static void main(String[] args){
			
		int[][] matrica = new int[5][6];
		for (int i = 0; i < 5; i++)
			System.out.println("Broj elemenata " + i + ". vrste: " + matrica[i].length);		
			
		matrica[0] = new int[8];
		matrica[3] = new int[35];
		matrica[4] = new int[100];
			
		System.out.println("Nakon izmjene...");
			
		for (int i = 0; i < 5; i++)
			System.out.println("Broj elemenata " + i + ".te vrste: " + matrica[i].length);
	}
}