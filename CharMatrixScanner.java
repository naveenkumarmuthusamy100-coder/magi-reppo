import java.util.Scanner;
class CharMatrixScanner
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        char[][] letters = new char[4][5];

        System.out.println("Enter characters:");

        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 5; j++) 
			{
                letters[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 5; j++) 
			{
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }

    }
}