/*Write a program to decipher the string?
Example : input1: a2b1c2d3e2
                 Output : “aabccdddee”
*/

class day12_4
{
	public static void main(String[] args)
	{
		String  str="a1b2c3";
		String result="";
		for(int i=1;i<str.length();i++)
		{
			if(i%2==1)
			{
				int num=Character.getNumericValue(str.charAt(i));
				for(int j=num;j>0;j--)
				{
					result +=str.charAt(i-1);
				}
			}
			
		}
		System.out.println(result);
	}
}

