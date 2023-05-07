class integerToBinary
 {
 	public static void main(String[] args)
 	{
 	
 		int number = 42;
 	
 		System.out.println(intBinary(number));
 	
 	}
 	public static String intBinary(int number)
 	{
 		String x="";
 		String bag="";
 		
 		while(number>0)
 		{
 			bag=bag+number%2;
 			number=number/2;
 		}
 		for(int i = 0 ;i < bag.length(); i++)
 		{
 		       x=bag.charAt(i)+x;
 		     
 		}
 		return x;
 
 	}
 	
 	
 }
