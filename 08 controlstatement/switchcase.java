class switchcase
{
	public static void main(String args[])
	{
		int p = 6;
		switch(p)
		{
			case 1 : System.out.println("Inside case 1");
			         System.out.println("2nd statement");
					 System.out.println("3rd statement");
					 break;
			case 2 : System.out.println("Inside case 2");
			         break;
			case 3 : System.out.println("Inside case 3");
			         break;
			case 4 : System.out.println("Inside case 4");
			         break;
			default : System.out.println("Inside default case");
		}
		System.out.println("Outside switch case");
	}
}