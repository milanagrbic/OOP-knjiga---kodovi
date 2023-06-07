class Grad{
		
	private String naziv;
	private  int postanskiBroj;
	private String drzava;
	Stanovnistvo st;
		
	public Grad(){}
		
	public Grad(String n, int b, String d){
		naziv = n;
		postanskiBroj = b;
		drzava = d;	
		st = new Stanovnistvo();
		st.setBrojStanovnika(1000);
			
	}
	public void setst(int b){
		st.setBrojStanovnika(b);
	}
	public Grad(String n, int b){
		this(n,b,"BiH");
	}
		
	public Grad(Grad grad){
		this.naziv = grad.naziv;
		this.postanskiBroj = grad.postanskiBroj;
		this.drzava = grad.drzava;
		this.st = grad.st;
	}
		
	public String toString(){
		String s = postanskiBroj+" "+naziv+", "+drzava+", "+st+"\n";
		return s;	
	}
}