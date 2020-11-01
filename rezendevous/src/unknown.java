
public class unknown {

	private int i=1000;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "unknown [i=" + i + ", getI()=" + getI() + "]";
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unknown k=new unknown();
		System.out.println(k);		//toString() is defined in Object class which can be extended to other classes.So, we can print "K" directly.
	}

	

}
