public class Sortiranje{
	public static void bubbleSort(Comparable[] niz){
		
		Comparable temp;
		for(int i = 1; i < niz.length; i++){	
			for(int j = niz.length - 1; j >= i; j--)
			if(niz[j].compareTo(niz[j - 1]) > 0){
				temp = niz[j];
				niz[j] = niz[j-1];
				niz[j-1] = temp;
			}
		}
	}
	
	public static void insertSort(Comparable[] niz){
		
		for (int i = 1; i < niz.length; i++){
			Comparable temp = niz [i];
			
			int j;
			for(j = i - 1; j >= 0; j--)
				if(niz[j].compareTo(temp)>0)
					niz[j + 1] = niz[j];
				else 
					break;
			
			niz[j + 1] = temp; 
		}
	}
}