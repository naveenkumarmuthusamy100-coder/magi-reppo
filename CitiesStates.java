import java.util.Scanner;
class CitiesStates 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        String[][] cities = new String[4][3];
        System.out.println("Enter city names:");
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                cities[i][j] = sc.next();
            }
        }
        System.out.println("Cities Statewise:");
        for (int i = 0; i < 4; i++)
			{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(cities[i][j] + " ");
            }
            System.out.println();
        }


    }
}