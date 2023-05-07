/*Write a program to generate all the substring  present in a string?
Example : input : “bootcamp”;
                 Output : 10
*/

class day3_5
{
	public static void main(String[] args)
	{
		String str="Bhavana";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				count++;
			}
		
		}
		System.out.println(count);
	}
}
