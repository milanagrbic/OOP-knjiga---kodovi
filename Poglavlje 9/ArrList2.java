import java.util.ArrayList;
public class ArrList2{
	public static void main(String[] args){
		ArrayList lista = new ArrayList();
		lista.add("Milan");
		lista.add("Milica");
		lista.add("Tatjana");
		lista.add("Aleksandar");
		for(int i = 0; i < lista.size(); i++)
			System.out.println((String)lista.get(i));
	}
}