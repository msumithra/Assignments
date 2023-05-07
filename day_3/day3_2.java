/*Write a program to count all vowels and consonants present in a string?
Example : input : “jtbfoundation”
                 Output : 4
*/

class day3_2
{
	public static void main(String[] args)
	{
		String str="Bhavana";
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println(v+" "+c);
	}
}
