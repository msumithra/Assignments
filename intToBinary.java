/*class main{
	public static void main(String[] args){
		int number=42;
		System.out.println(Integer.toBinaryString(number));
	}
}*/



//program to convert an integer into its binary.
 class integerToBinary
 {
 	public static void main(String[] args)
 	{

 	/*}
 	
 	public static void inToBinary(int number)
 	{*/
 		int number=0;
 		String bag="";
 		String Str="";
 		
 		while(number>0)
 		{
 			bag=bag+number%2;
 			number=number/2;
 		}
 		for(int i = 0 ;i < bag.length(); i++)
 		{
 		       str=bag.charAt(i)+str;
 		}
 		System.out.println(str);
 		}
 	
 }
