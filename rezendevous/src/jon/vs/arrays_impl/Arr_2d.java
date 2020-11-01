package jon.vs.arrays_impl;

public class Arr_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s[][]= {
					{2,4,0},
					{0,6},
					{1,0,0}
		          };
	
		try {
			
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				{
				System.out.print(s[i][j]+" ");
				}
			System.out.println("  ");
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.print("values to be provided in declaration");
		}
		System.out.println("\n \n \n");
	System.out.println("No blank value accepted");	
		
	}

	

}
