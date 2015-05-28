package py.com.uaa.pooj.util.tiposclases;

public class Figura {

	int x;
	int y;
	


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//Constructor
	Figura(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void print(){
		
	}
	
	public static void main(String[] args) {
		Figura figu = new Figura(7, 8); 
		
		for (int i = 0; i < args.length; i++){
			String local = args[i] ;
		}
	}
}
