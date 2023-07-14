import java.util.*;
public class Zamjenski4{
	public static void stampajListu(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
	public static void main(String[] args){
		List<Object> lista1 = Arrays.asList(1, 2, 3);
		stampajListu(lista1);
			
		List<Integer> lista2 = Arrays.asList(10, 20, 30);
		stampajListu(lista2);
	}
}