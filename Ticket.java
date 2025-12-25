import java.util.Scanner;

class Ticket 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        switch (t) 
		{
            case 1 -> System.out.println("General - Rs.150");
            case 2 -> System.out.println("Sleeper - Rs.350");
            case 3 -> System.out.println("AC 3 Tier - Rs.750");
            case 4 -> System.out.println("AC 2 Tier - Rs.1200");
            case 5 -> System.out.println("First Class - Rs.2000");
            default -> System.out.println("Wrong Choice");
        }
    }
}
