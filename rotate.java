class rotate
{
	public static void main(String[] args)
	{
		System.out.println(rotate(10,4,5));
		System.out.println(rotate(10,3,4));
		System.out.println(rotate(10,1,3));
		System.out.println(rotate(10,2,2));
		
	}
	
	public static int rotate(int totalCount, int pos, int length)
	{
		pos = pos - 1;
		for(int i=1;i<=totalCount;i++)
		{
			pos = rotateBy1(pos, length);	
		}
		
		return pos;
	}
	
	public static int rotateBy1(int pos, int length)
	{
		if(pos == length)
		{
			return 1;
		}
		
		else
		{
			return ++pos;
		}
	}
}
