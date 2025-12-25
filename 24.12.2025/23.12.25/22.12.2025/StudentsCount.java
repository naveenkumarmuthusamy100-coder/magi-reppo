class StudentsCount 
{
    public static void main(String[] args)
	{
        int total = 50;
        int girls = (40 * total) / 100;
        int boys = total - girls;

        System.out.println("Girls: " + girls);
        System.out.println("Boys: " + boys);
    }
}
