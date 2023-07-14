class Cvor <T>{    
	T podatak;    
	Cvor<T> sljedeci;    
	
	public Cvor(T t) {    
		this.podatak = t;    
		this.sljedeci = null;    
	}    
} 