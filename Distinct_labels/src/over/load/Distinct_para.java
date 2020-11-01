package over.load;

class Distinct_para {
	
	public static void main(String args[]) {
		Distinct_para para=new Distinct_para();
		para.m1(1,"A");
		para.m1(2,8);
		
	}

	public void m1(int a, int b)
	{System.out.println("Label A");}
	
	public void m1(int a, String b)
	{System.out.println("Label B");}
}
