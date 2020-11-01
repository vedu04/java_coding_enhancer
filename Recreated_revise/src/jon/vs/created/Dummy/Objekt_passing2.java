package jon.vs.created.Dummy;

public class Objekt_passing2 {

	private String city; 

	private String m1(String t)
	{
		city="San Francisco";
		t=city;
		return t;
	}
	
	public String m2(String m1)
	{
		
		return m1("hi");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objekt_passing o1= new Objekt_passing();
		System.out.println(o1.m2("hello"));
		

		
	}

}
