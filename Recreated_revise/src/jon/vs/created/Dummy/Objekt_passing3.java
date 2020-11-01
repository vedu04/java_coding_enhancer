package jon.vs.created.Dummy;

public class Objekt_passing3 {

	private String city; 

	private String m1(String t)
	{
		city="San Francisco";
		t=city;
		return t;
	}
	
	public String m2()
	{
		
		return m1("hi");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objekt_passing o1= new Objekt_passing();
		//System.out.println(o1.m2());			-> this line throws error : method m2(String) is not applicable for the arguments ()
	
		System.out.println(o1.m2(null));
		

		
	}
}
