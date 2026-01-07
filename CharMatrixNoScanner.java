class CharMatrixNoScanner
{
	public static void main(String[] args)
	{
		char [][] letters={{'v','i','j','a','y'},{'a','j','i','t','h'},{'k','a','m','a','l'},{'r','a','j','i','n','i'}};
		for (int i=0; i<letters.length; i++)
		{
			for(int j=0; j<letters[i].length; j++)
			{
				System.out.print(letters[i][j] + "  ");
			}
			System.out.println("");
			
		}
	}	
	
}