package jon.vs.arrays_impl;

public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= new int[3][4];
		a[0][0]=2;
		a[0][1]=4;
		a[1][0]=4;
		a[1][3]=8;
		a[2][1]=6;
		a[2][3]=7;
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<4;j++)
			{
			System.out.print(a[i][j]+ " ");
			}	
		 System.out.println(" ");	
	
		}
	}	

}
