class Scholarship
{
	public static void main(String[] args)
	{
		int marks=85;
		boolean attendance= true;
		boolean discipline =true;
		
		boolean pass= marks>=35;
		boolean eligible=(marks >=80) && (attendance || discipline);
		
		
	   System.out.println("pass&eligible for scholarship:"+ (pass&eligible));
	}
	
	
	
}