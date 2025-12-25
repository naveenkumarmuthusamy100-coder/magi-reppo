import java.util.Scanner;

class Traffic 
	{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        switch (c) 
		{
            case "Red": System.out.println("Stop"); break;
            case "Yellow": System.out.println("Ready"); break;
            case "Green": System.out.println("Go"); break;
            default: System.out.println("Wrong Color");
        }
    }
}
