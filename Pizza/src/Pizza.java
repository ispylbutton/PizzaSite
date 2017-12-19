

public abstract class Pizza extends Food {
	
	public int getSize() {
		return Size;
	}
	
	public void setSize(int size) {
		Size = size;
	}
	
	public void incSize() {
		Size += 1;
		if (Size == 3) Size = 0;
	}
	
	public double getCost(){
		switch(this.getSize()){
			case 0: return 7.99; 
			case 1: return 8.99; 
			case 2: return 9.99; 
			default: return 0.00;
		}
	}
	
	private int Size = 0;
}