interface Par<K, V> {
	public K getKljuc();
	public V getVrijednost();
	
	public void setKljuc(K k);
	public void setVrijednost(V v);
}

public class UredjenPar<K, V> implements Par<K, V> {
	
	private K kljuc;
	private V vrijednost;
	
	public UredjenPar(K kljuc, V vrijednost) {
		this.kljuc = kljuc;
		this.vrijednost = vrijednost;
	}
	public void setKljuc(K kljuc) {
		this.kljuc = kljuc;
	}
	public void setVrijednost(V vrijednost) {
		this.vrijednost = vrijednost;
	}
	
	public K getKljuc()	{ return kljuc; }
	public V getVrijednost() { return vrijednost; }
}