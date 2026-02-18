import java.util.Scanner;
class Calculators
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Calculators obj = new Calculators();
		
		System.out.println("Enter your Choice");
		System.out.println("1.Addition:");
		System.out.println("2.Subtraction:");
		System.out.println("3.Multiplication:");
		System.out.println("4.Divition:");
		
		int calc=sc.nextInt();
		
		System.out.println("Enter 1st Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd Numbers:");
		int b=sc.nextInt();
		
		switch(calc)
		{
			case 1: 
					System.out.println("Addition Result Is:" + obj.add(a, b) );
					break;
			case 2: 
					System.out.println("Subtraction Result Is:" + obj.sub(a, b) );
					break;
			case 3: 
					System.out.println("Multipliction Result Is:" + obj.multi(a, b) );
					break;
			case 4: 
                if(b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Invalid: Cannot divide by zero");
                break;
			default:
					System.out.println("Invalid Choice" );
		}
		
	}
	
		int add(int a, int b)
		{
			return a+b;
		}
		int sub(int a,int b)
		{
			return a-b;
		}
		int multi(int a, int b)
		{
			return a*b;
		}
		int div(int a, int b)
		{
			return a/b;
		}
	
}
