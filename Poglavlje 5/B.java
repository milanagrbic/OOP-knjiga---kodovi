public class B extends A{

	private int x;
	private int z;
	
	
	public B(){
		super();
		x = 2;
		z = 3;
	}
	

	public String toString1(){
		String s = "B: x = " + x + ", y = " + y + ", z = " + z;
		return s;
	}
	
	public String toString2(){
	String s ="B: x iz A = " + super.x + ", x = " + x + ", y = " + y + ", z = " + z;
		return s;
	}

}