
public class anonymity {

	private String s="Anki";
	
	public String getS() {
		System.out.print("s:" +s);
		return s;
		
	}
	
	
	@Override
	public String toString() {
		return "anonymity [s=" + s + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new anonymity().getS();			// how can I use toString() ?
										// Here, method is called using anonymous function
											//  try also with fields
	}

}
