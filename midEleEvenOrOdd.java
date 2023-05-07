// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class evenMid 
{
    	public static void main(String[] args) 
    	{
        	int[] array = {};
        	
        	System.out.println(findingMidElement(array.length-1,array));
    	}
    //checking even or odd
    	public static boolean EvenOrOdd(int number)
    	{		
        	if(number%2==0)
        	{
            		return true;
        	}
        	else
        	{
            		return false;  
        	}
    	}
    //Finding the middle element 
    	public static String findingMidElement(int Arraylength, int[] array)
    	{
        	int middleElement= Arraylength/2;
        	if(EvenOrOdd(array[middleElement]))
        	{
            		return "even";
        	}
        	else
        	{
            		return "odd";
        	}
    	}
    
}
