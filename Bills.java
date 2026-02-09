import java.util.Scanner;
class Bills
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Bill Category:");
		System.out.println("1.Electricity Bill");
		System.out.println("2.Water Bill");
		System.out.println("3.Internet Bill");
		System.out.println("4.Exit");
		
		int bills = sc.nextInt();
		System.out.println("Selected Bill:");
		
		switch(bills)
		{
			case 1: 
					System.out.println("Electricity Units Consumed:");
					int units=sc.nextInt();
				if(units<=100)
				{
					bills = units*2;
				}
				else if(units<=300)
				{
					bills = units*3;
				}
				else
				{
					bills =units*5;
				}
				break;
			case 2:
					System.out.println("Enter House Type And Their Water Bills");
					System.out.println("1.Apartment");
					System.out.println("2.Individual House");
					int house=sc.nextInt();
					if(house==1)
					{
						System.out.println("Apartment Water Consumed Bill: Rs.300");
					}
					else if(house==2)
					{
						System.out.println("Individual House Water Consumed Bill: Rs.500");
					}
					else
					{
						System.out.println("Invalid House Type");
					}
				break;
		case 3:
					System.out.println("Internet Plan");
					System.out.println("1.Basic Plan");
					System.out.println("2.Standard Plan");
					System.out.println("3.Premium Plan");
					int plans=sc.nextInt();
					if(plans==1)
					{
						System.out.println("Basic Internet Plan: Rs.399");
					}
					else if(plans==2)
					{
						System.out.println("Standard Internet Plan: Rs.699");
					}
					else
					{
						if(plans==3)
					{
						System.out.println("Premium Internet Plan: Rs.999");
					}
					else
					{
						System.out.println("Invalid Plan");
					}
					}
				break;
			case 4:
					{
					System.out.println("Thank You For Using Smart City Utility System");
					}
				break;

				default:
					System.out.println("Invalid choice");
		
		}
		
		
	}
}