package jon.vs.tricks;

public class Objekt_other {

	private String t;
	
	private String method1(String toy)
	{
		return toy="apple i-phone";
	
	}
	
	// method ko hhi directly call kra dia inside another method's block
	public String method2()
	{
	  return method1(t);				
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objekt_other a= new Objekt_other();
		System.out.print(a.method2());
	}

}
