import java.util.*;
public class Zamjenski3{
	public static void dodajBrojeve(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}	
	public static void main(String[] args){
			
		List<Integer> lista1 = new ArrayList<Integer>();
		dodajBrojeve(lista1);
		System.out.println(lista1);
			
		List<Number> lista2 = new ArrayList<Number>();
		dodajBrojeve(lista2);
		System.out.println(lista2);
			
	}	
}