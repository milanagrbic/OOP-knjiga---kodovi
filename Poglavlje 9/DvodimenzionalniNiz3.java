public class DvodimenzionalniNiz3{
	public static void main(String[] args){
					
		int[][] matrica = {{1,2,3,4,5}, {6,7,8,9,10,11,12}, {8000}};
		for (int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++)
				System.out.print(matrica[i][j] + "\t");
			System.out.println();
		}	
	}
}