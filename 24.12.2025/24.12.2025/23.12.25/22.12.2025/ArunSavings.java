class ArunSavings 
{
    public static void main(String[] args)
	{
        int P = 50000, R = 6, T = 5;
        int SI = (P * R * T) / 100;
        System.out.println("Interest: " + SI);
        System.out.println("Total: " + (P + SI));
    }
}
