class pyramid
{
    public static void main(String[] args) 
    {
        int rows = 5;

        for (int i = 1 ; i <= rows; i++) 
		{
			for (int j = 0 ; j < rows - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0 ; k < (i * 2) - 1; k++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}	