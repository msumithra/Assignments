class main
{
	public static void main(String[] args)
	{
		String s="Reverse";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			
			res=s.charAt(i)+res;
		}
		System.out.println("Reversed String:"+res);
		
	}
}
