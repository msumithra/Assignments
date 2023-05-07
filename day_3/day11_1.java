/*Write a program to print all the vowel and constant present in the word present in a sentence (Muneera)
Write a program to count the occurance of each vowel character in the word
*/

class day11_1
{
	public static void main(String[] args)
	{
		String str="jtd jtbb team";
		int s=0;
		int p=0;
		
		String vowel = "";
		String constant = "";
		while(s<str.length())
		{
			while(s<str.length() && str.charAt(s) !=' ')
			{
				s++;
			}
			String store=str.substring(p,s);
			vowel += v(store);
			constant += c(store);
			s=s+1;
			p=s;
		
		}
		System.out.println("vowel String : " + vowel);
		System.out.println("consonant String : "+ constant);
	}
	public static String v(String str)
	{
		String vowel = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowel += str.charAt(i);
			}
		}
		return vowel;
	}
	public static String c(String str)
	{
		String consonant = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a' || str.charAt(i)!='e' || str.charAt(i)!='i' || str.charAt(i)!='o' || str.charAt(i)!='u')
			{
				consonant += str.charAt(i);
			}
		}
		return consonant;
	}
}
