import java.util.Scanner;

class Area
	{
    public static void main(String[] args) 	
	{
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();

        switch (ch) 
	{
            case 1:
                double r = sc.nextDouble();
                System.out.println(3.14 * r * r);
                break;

            case 2:
                double s = sc.nextDouble();
                System.out.println(s * s);
                break;

            case 3:
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println(l * b);
                break;

            case 4:
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println(0.5 * base * h);
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}
