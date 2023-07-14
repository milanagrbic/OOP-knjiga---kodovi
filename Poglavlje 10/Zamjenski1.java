import java.util.ArrayList;
	
public class Zamjenski1{
		
	public static double saberi(ArrayList<Number> list ){
		double suma = 0; 
		for(Number element:list)
			suma += element.doubleValue();
			
		return suma;	
	} 
	public static void main( String[] args ){
		Number[] niz = {2, 4.5, 1.3, 7, 22};
		ArrayList<Number> lista = new ArrayList<Number>();
			
		for ( Number element : niz )
			lista.add(element);
			
		System.out.println( "Suma elemenata liste je "+saberi(lista));
	}	
} 