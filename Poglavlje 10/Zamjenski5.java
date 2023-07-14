import java.util.*;
public class Zamjenski5{
	public static int brojElemenata(List<?> list) {
		int brojac = 0;
		for (Object elem : list)
			brojac++;
		return brojac;
	}
	public static void main(String[] args){
		List<Object> lista1 = Arrays.asList(11, 222, 3333, 4444);
		int b1 = brojElemenata(lista1);
		System.out.println("Broj elemenata liste1: " + b1);
		
		List<Integer> lista2 = Arrays.asList(10, 20, 30);
		int b2 = brojElemenata(lista2);
		System.out.println("Broj elemenata liste2: " + b2);
	}
}