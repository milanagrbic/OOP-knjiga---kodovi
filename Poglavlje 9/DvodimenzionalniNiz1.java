import java.util.Scanner;	
	
public class DvodimenzionalniNiz1{
	static Scanner sken = new Scanner(System.in);
	static void unos(int[][] matrica){
	System.out.println("Unos matrice...");
	for(int i = 0; i < matrica.length; i++)
		for(int j = 0; j < matrica[i].length; j++){
			System.out.print("[" + i + "," + j + "]. element:");
			matrica[i][j] =  sken.nextInt();
		}
	}
	static void ispis(int[][] matrica){
		System.out.println("Ispis matrice...");
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++)
				System.out.print(matrica[i][j]+"\t");
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("Unesi broj vrsta: ");
		int m = sken.nextInt();
		System.out.print("Unesi broj kolona: ");
		int n = sken.nextInt();
		int[][] matrica = new int[m][n];
		System.out.println("Matrica ima " + matrica.length + " vrsta i " + matrica[0].length + " kolona.");
		unos(matrica);
		ispis(matrica);
	}
}
