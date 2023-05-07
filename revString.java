class reverseString

{
	public static String str = "we need to revese the string";
	
	public static char[] stringArray = str.toCharArray();

	
	public static void main(String[] args)

	{
		System.out.println(stringArray);
		
		
		int stringStart = 0;
		int stringEnd = str.length() - 1;
		
		if(stringStart>=str.length()){
			return;
		}
		
		
		while(stringStart <= stringEnd)
		{
			char temp = stringArray[stringStart];
			stringArray[stringStart] = stringArray[stringEnd];
			stringArray[stringEnd] =temp;
			
			stringStart++;
			stringEnd--;
				
		}
		System.out.println(stringArray);
	}
}


