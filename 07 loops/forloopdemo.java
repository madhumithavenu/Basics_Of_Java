class forloopdemo
{
	public static void main(String args[])
	{
		int z[] = {50,65,75,80,95};
		for(int i = 0;i < z.length;i++)
		{
			System.out.println("Value of z["+i+"] is :" + z[i]);
		}
		System.out.println("Outside for loop");
	}
}