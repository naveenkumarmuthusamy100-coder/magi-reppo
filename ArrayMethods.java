import java.util.Scanner;

class ArrayMethods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int choice;

        do
        {
            System.out.println("Needed Array Works");
            System.out.println("1. Maximum");
            System.out.println("2. Minimum");
            System.out.println("3. Reverse");
            System.out.println("4. Average");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    int max = a[0];
                    for(int i = 1; i < n; i++)
                    {
                        if(a[i] > max)
                            max = a[i];
                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 2:
                    int min = a[0];
                    for(int i = 1; i < n; i++)
                    {
                        if(a[i] < min)
                            min = a[i];
                    }
                    System.out.println("Minimum = " + min);
                    break;

                case 3:
                    for(int i = 0; i < n/2; i++)
                    {
                        int temp = a[i];
                        a[i] = a[n-1-i];
                        a[n-1-i] = temp;
                    }

                    System.out.println("Reversed Array:");
                    for(int i = 0; i < n; i++)
                        System.out.print(a[i] + " ");
                    break;

                case 4:
                    int sum = 0;
                    for(int i = 0; i < n; i++)
                    {
                        sum = sum + a[i];
                    }
                    double avg = (double)sum / n;
                    System.out.println("Average = " + avg);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong choice");
            }

        } while(choice != 5);
    }
}
