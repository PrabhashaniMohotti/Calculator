public class Calculator {
	public static void main(String args[]){
		Cal C = new Cal();
		C.setAnswer(10, 5);
		
		System.out.println(C.getAnswer1());
		System.out.println(C.getAnswer2());
		System.out.println(C.getAnswer3());
		System.out.println(C.getAnswer4());
	}
}

class Cal{
	private int x;
	private int y;
	
	public void setAnswer(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getAnswer1(){
		return this.x + this.y;
	}
	
	public int getAnswer2(){
		return this.x - this.y;
	}
	
	public int getAnswer3(){
		return this.x / this.y;
	}
	
	public int getAnswer4(){
		return this.x * this.y;
	}
}