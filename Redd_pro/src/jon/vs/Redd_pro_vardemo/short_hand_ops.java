package jon.vs.Redd_pro_vardemo;

public class short_hand_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	i=23, j=6;
				
				
	j=i++;																			//j=4; i=5
	j=j--;																			//j(as)=4,  j(next)=3
	j++;																			//j(as)=4, j(in)=5 ->	//j=j+1
	j++;
	j=j++;  																		//j(as)=5, j(in)=6 -> //j=j+1
	i=i++;																				//i(as)=5, i(in)=6
   System.out.println("The value of j is "+j + " and the value of i is "+i);

	
	//assigned var is given priotity than inc/decremented var to give/put value in the next statement var.



/*	int i=8, k=3;
	
	i++;
	k=++i + i++;
	++k;
	k++;
	System.out.println("i="+i + ",k=" +k);*/
   /*int a=19;
			a=a++ + ++a;
			a++;
			a=a++;
			System.out.println("a="+a);*/
	}
	
}