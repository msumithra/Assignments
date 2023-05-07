/*
Write a program for  removing the leading zero present in a string  
Example : Input  : 00000123569 
                Output :  123569
*/

class day4_9
{
	public static void main(String[] args)
	{
		String str="00000123569";
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==('0')))
			{
				ans+=str.charAt(i);
			}
		}
		System.out.println(ans);
	}
}
