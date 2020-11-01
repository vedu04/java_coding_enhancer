package over.load;

class Return_type {
	
	public static void main(String args[]) {
	Return_type t1=new Return_type();
	t1.sun(3, 4);
	t1.sun(5, "Arch");
		
		}
	
	

	void sun(int a, int v)
	{System.out.println("Label my name");}
	
	/*int sun(int a, int b)
	{System.out.println("Labelling the name");}
	*/
	int sun(int a, String v)
		{System.out.println("Luxuorios names");
		  return a;}
	
}

