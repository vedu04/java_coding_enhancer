package over.load;

public class Oreder_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oreder_para o1=new Oreder_para();
		o1.m1(2, 3);
		o1.m1(2, 3);
		o1.m1("d", 3);
		o1.m1(2, "f");
	}
	
	void m1(int q, int c)
	{System.out.println("Nostalgia");}
	
	/*void m1(int c, int q )							// Duplicate order of type(int,int)
	{System.out.println("AMenda");}*/
 
	void m1(String w, int g)
	{System.out.println("Netflix is the one!");}
	
	void m1(int g, String w)
	{System.out.println("libraries are tremendous");}
}
