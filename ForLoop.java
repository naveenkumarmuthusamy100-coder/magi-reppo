import java.util.Scanner;
class ForLoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N number:");
		int n = sc.nextInt();
		for(int m=1; m<=n;m++)
		{
			System.out.println(m);
		}
		
	}
	
}