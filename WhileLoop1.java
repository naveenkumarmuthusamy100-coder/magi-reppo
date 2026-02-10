import java.util.Scanner;
class WhileLoop1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n= sc.nextInt();
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println(n + " x "+ i + " ="  + (n * i));
			
			i++;
		}
		
	}
}