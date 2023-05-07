//check duck number or not
//if number starts with 0 ,it is not a ducknumber.And if a number does not start with 0 And if the number contains 0 , then it is a ducknumber.
public class ducknumber
{
	public static void main(String[] args)
	{
		int num = 2147483607;
		System.out.println(checkDuckNum(num));
		if(checkDuckNum(num))
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a duck number");
		}
	}
	public static boolean checkDuckNum(int num)
	{
		String str = ""+num;
		for(int i = 0 ; i < str.length() ;i++)
		{
			if(str.charAt(0) != '0')
			{
				if(str.contains("0"))
				{
					return true;
				}
			}
		}
		return false;	
	}

}
