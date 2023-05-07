/*Write a program to print long palindromic substring from the given string
Input : str = “babad”;
Output : aba

*/


public class day5_1 
{
    public static void main(String[] args) 
    {
        String str = "babad";
        
        substrings(str);
    }

    public static void substrings(String str) 
    {
       	       int end = str.length();
      	       String LargestSubstring = str.charAt(0) + " " ;
        	for (int i = 0; i < end; i++) 
        	{
            		for (int j = i + 1; j <= end; j++) 
            		{
            			String temp = str.substring(i, j);
                		if(isPalindrome(temp) && temp.length() >= LargestSubstring.length()){
                			System.out.println(temp);
                			LargestSubstring = temp;
                		}
                	}
            	}
            	//System.out.println(LargestSubstring);
    }
    public static boolean isPalindrome(String substr){
    	int start = 0;
    	int end = substr.length()-1;
    	boolean flag = true;
    	while(start < end){
    		if(substr.charAt(start) != substr.charAt(end)){
    			flag = false;
    			break;
    		}
    		start++;
    		end--;
    	}
    	return flag;
    }	
    
}
