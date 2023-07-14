class Brojevi<T extends Number>
{
	T[] niz;
	Brojevi(T[] a)
	{
		niz = a;
	}
	double prosjecnaVrijednost(){
		double suma = 0.0;
		for (int i = 0; i < niz.length; i++)
			suma += niz[i].doubleValue();
		return suma / niz.length;
	}
		
}