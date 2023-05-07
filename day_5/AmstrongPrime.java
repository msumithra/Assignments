
/*2
3
5
7
28116440335967 (checked with: Factors Calculator
)
449177399146038697307 (checked with: Big Integer Calculator
)
35452590104031691935943 (checked with: Big Integer Calculator
*/

public class AmstrongPolindrome
{

	 public static void main(String[] args)
	  {
		  int num=5260;
		  for(int i=1;i<=num;i++)
		  {
			int count=0;
				 for(int j=1;j<=num;j++)
				 {
					 if(i%j==0)
					 {
					 	count ++;
					 }
				
				 }
				 if(count==2)
				 {
				 	int number = (i);
				 	//System.out.println(number);
				 	if(Amsg(number))
				 	{
				 		System.out.println(" ArmstrongcomPrime   "+i);
				 	}
				 	
		   		 }
		  } 
		  
	}
	  
	
	  
	public static boolean Amsg(int num)
	{
		String str="" +num;
		int arm=0;
		for(int i=0;i<str.length();i++)
		{
			int newNum=str.charAt(i)-'0';
			arm+=java.lang.Math.pow(newNum,str.length());
		}
		if(num==arm)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	  
 }
