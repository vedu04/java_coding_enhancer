package labelling;



public class Demo_forlabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int p,j; boolean a;
    ved:
    for(p=1;p<=5;p++)
    {
    	for(j=1;j<=8;j++)
    	 {
    		
    		if(p==3)
    		{System.out.println("");
    		 continue ved;					//continue ved ke kaaran space ni print hua. Output me space sirf syso ke kaaran print hua h
    		}
    	
    		System.out.print("@ ");
    	
    	}
    	System.out.println("");
    }
	}

}
