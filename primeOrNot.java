//checking prime or not

class primeOrNot
{
	public static void main(String[] args)
	{
	
		System.out.println(checkPrimeOrNot(999999999));	
	}
	
	public static int checkPrimeOrNot(int number)
	{
		if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0)
		{
			System.out.println("It is a prime number: "+ number);
		}
		else if(number == 2 || number == 3)
		{	
			System.out.println("It is a prime number: "+ number);
		}
		else
		{
			System.out.println("It is not a prime number: "+ number);
		}
		
		return number;
	}
	
}  
