

//Write a java program to reverse a string.


/*class reveseString{
	public static String str = "we need to revese the string";
	
	public static char[] stringArray = str.toCharArray();
	
	public static void main(String[] args)
	{
	
		System.out.println(stringArray);
		findReverseString(0, stringArray.length-1, stringArray);
		System.out.println(stringArray);
		int stringStart = 0;
		int stringEnd = 0;
		
		if(stringEnd !=-1)
		{
			findReverseString(stringStart, stringArray.length-1, stringArray);
			
			stringStart = stringEnd+1;
			System.out.println(stringArray);
		}
		
		
		
		
		
	}
	public static void findReverseString(int stringStart,int stringEnd, char[] stringArray)
	{
		if(stringStart>=stringArray.length)
		
		{
			return;
		}
		while(stringStart >= stringEnd)
		{
			char temp = stringArray[stringStart];
			stringArray[stringStart] = stringArray[stringEnd];
			stringArray[stringEnd] =temp;
			
			stringStart++;
			stringEnd--;
			
		}
		
	}
}
*/



class reverseString

{

	public static String str = "we need to revese the string";
	
	public static char[] stringArray = str.toCharArray();
	
	public static void main(String[] args)
	{
		
		int stringStart = 0;
		int stringEnd = str.length()-1;
		while(stringStart < str.length())
		{
			char temp = stringArray[stringStart];
			stringArray[stringStart] = stringArray[stringEnd];
			stringArray[stringEnd] =temp;
			
			stringStart++;
			stringEnd--;
				
		}
		return sentenceEnd;
		//System.out.println(stringEnd);
		
	}

}
