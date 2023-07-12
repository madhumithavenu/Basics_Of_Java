class labelledloops
{
	public static void main(String args[])
	{
		System.out.println("#### Start of nested loops ####");
		outer:for(int i = 0;i < 3; i++)
		{
			System.out.println("----------Inside For loop----------");

			inner:for (int j = 3; j > 0 ;j--)
			{
				if (i == j)
				{
					break inner;
				}
				System.out.println("******Inside Inner loop*****");
			}
			System.out.println("<----Outside Inner loop---->");
		}
		System.out.println("#### End of Nested loop ####");
	}

}