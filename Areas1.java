import java.util.Scanner;

class Areas1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       Areas1 obj = new Areas1(); 

        int choice;

        do
        {
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();

                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();

                    System.out.println("Area = " + obj.rectangle(l, b));
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();

                    System.out.println("Area = " + obj.circle(r));
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();

                    System.out.println("Area = " + obj.square(s));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();

                    System.out.println("Area = " + obj.triangle(base, height));
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 5);
    }

    double rectangle(double l, double b)
    {
        return l * b;
    }

    double circle(double r)
    {
        return 3.14 * r * r;
    }

    double square(double s)
    {
        return s * s;
    }

    double triangle(double b, double h)
    {
        return 0.5 * b * h;
    }
}
