package jon.vs.rezendevous;

class ASCII_print {				//its just a class and declared as package level only ( not public )

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for(int i=0;i<=127;i++)
			{
				System.out.printf("%d:  %c \n",i, i);
			}
	}

}
