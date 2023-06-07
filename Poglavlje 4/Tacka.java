public class Tacka{
	
	private int x;
	private int y;
	
	public Tacka(){		
		x = 0;
		y = 0;
	}
	
	public void setX (int x){
		this.x = x; //upotreba reference this za pristup atributu x objekta klase Tacka
	}
	
	public void setY (int y){
		this.y = y; //upotreba reference this za pristup atributu y objekta klase Tacka
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void pomjeriGoreDesno(){
		x += 1;
		y += 1;
	}
	
	public void pomjeriGoreLijevo(){
		x -= 1;
		y += 1;
	}
	
	public String toString(){
		String s = "(" + x + "," + y + ")";
		return s;
	}
}