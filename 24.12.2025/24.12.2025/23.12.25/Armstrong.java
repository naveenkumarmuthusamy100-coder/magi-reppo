class Armstrong
{
	
	{
    public static void main(String[] args) 

        int n = 1634;   // 4-digit number

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        int sum = (a * a * a * a)
                + (b * b * b * b)
                + (c * c * c * c)
                + (d * d * d * d);

        System.out.println(sum == n);
    }
}
