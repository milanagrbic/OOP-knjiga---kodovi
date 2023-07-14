import java.util.ArrayList;
	
public class Zamjenski2{		
		public static double saberi(ArrayList<? extends Number> list )
		{
			double suma = 0; 
			for(Number element:list)
			suma += element.doubleValue();			
			return suma;	
		} 
		public static void main( String[] args )
		{		
			Number[] niz1 = {2, 4.5, 1.3, 7, 22};
			ArrayList<Number> lista1 = new ArrayList<Number>();
			for ( Number element : niz1 )
				lista1.add(element);
			System.out.println( "Suma elemenata liste brojeva tipa Number je " + saberi(lista1));
			
			Integer[] niz2 = {1,2,3,4,5};
			ArrayList<Integer> lista2 = new ArrayList<Integer>();
			
			for ( Integer element : niz2 )
				lista2.add(element);
			
			System.out.println( "Suma elemenata liste cijelih brojeva je " + saberi(lista2));
			
			Double[] niz3 = {3.1,12.34,34.53,5.9};
			ArrayList<Double> lista3 = new ArrayList<Double>();
			
			for ( Double element : niz3 )
				lista3.add(element);
			
			System.out.println( "Suma elemenata liste realnih brojeva je " + saberi(lista3));
		}	
} 