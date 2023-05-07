
class day4_10{
	public static void main(String[] args)
	{
		String str= "ABC";
		String str1="BCA";
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
		  int asciiValue1 = str.charAt(i);
		 // System.out.println(str.charAt(i) + "=" + asciiValue1);
		  sum+=asciiValue1;
		}
		int sum1=0;
		for(int i=0; i<str1.length(); i++)
		{
		  int asciiValue = str1.charAt(i);
		 // System.out.println(str1.charAt(i) + "=" + asciiValue);
		  sum1+=asciiValue;
		}
		//System.out.println(sum+" "+sum1);
		if(sum>sum1)
		{
			System.out.println("Positive Value");
		}
		else if(sum==sum1)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Negetive Value");
		}
 	}
}
