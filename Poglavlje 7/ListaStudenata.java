public class ListaStudenata{
		
	public static void main(String[] args){
			
		Student [] lista = new Student[5];
		lista[0] = new Student("123/21", "Jovan", "Jovanovic", 8.5);
		lista[1] = new Student("128/21", "Nikola", "Nikolic", 8.5);
		lista[2] = new Student("111/21", "Jovana", "Jovanovic", 7.7);
		lista[3] = new Student("148/21", "Marko", "Markovic", 6.9);
		lista[4] = new Student("123/21", "Petra", "Petrovic", 8.2);
			
			
		Sortiranje.bubbleSort(lista);
		System.out.println("Lista sortiranih studenata:");
		for (Student s : lista)
			System.out.println(s);
			

		Sortiranje.insertSort(lista);
		System.out.println("Lista sortiranih studenata:");
		for (Student s : lista)
			System.out.println(s);
			

		Student test1 = new Student("128/21", "Nikola", "Nikolic", 8.3);
			
		if(Pretrazivanje.linearnaPretraga(lista, test1))
			System.out.println("Postoji student: " + test1);
		else
			System.out.println("Ne postoji student: " + test1);
			
		Student test2 = new Student("128/21", "Nikola", "Nikolic", 8.5);
			
		if(Pretrazivanje.binarnaPretraga(lista, test2))
			System.out.println("Postoji student: " + test2);
		else
			System.out.println("Ne postoji student: " + test2);

	}	
}