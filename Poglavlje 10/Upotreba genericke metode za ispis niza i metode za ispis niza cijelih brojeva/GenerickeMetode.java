public class GenerickeMetode{   
	public static < T > void stampaj(T[] elementi) { 
		System.out.println("Genericka metoda za stampanje."); 
		for ( T el : elementi){          
			System.out.print(el + " ");  
		}  
		System.out.println();  
	} 
	public static void stampaj(Integer[] elementi){  
		System.out.println("Metoda za stampanje cijelih brojeva.");
		
		for ( Integer el : elementi){          
			System.out.print(el + " ");  
		}  
		System.out.println();  
	} 
	public static void main( String args[] )
	{  
		Integer[] int_Niz = { 1, 3, 5, 7, 9, 11};  
		Character[] char_Niz = { 'G', 'e', 'n', 'e', 'r','i','c','i'};  
		
		System.out.println( "Sadrzaj cjelobrojnog niza:" );  
		stampaj(int_Niz);   
		
		System.out.println( "Sadrzaj niza karaktera:" );  
		stampaj(char_Niz);   
	}   
}