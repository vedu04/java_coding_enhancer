package jon.vs.arrays_impl;

public class jagged_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int d[][]= new int[4][];
		
		/*d[0]= {4,8,1,9,3};
		d[1]= {3,0};
		d[2]= {3,1,7};
		d[3]= {2,7,3,9,0,2,4};
		*/
		
		/*d[0]= new int[6];
		d[1]= new int[2];
		d[2]= new int[3];
		d[3]= new int[8];*/
		
		int d[][]= {
				{2,3,8,1,9},
				{1,4},
				{0,4,6},
				{2,9,0,7,5,4,6}				
		       };
		
		for(int i[] :d)
		{
			for(int j : i)
			{	
				System.out.print(j+" ");
				}
			System.out.println(" ");
		}
	
		/*for(int i=0;i<4;i++)							// using this for gives differ output than for each(above) loop
		{
			for(int j=0;j<5;j++)
			{	
				System.out.print(d[i][j]+" ");
				}
			System.out.println(" ");
		}*/
	
		
	}

}
