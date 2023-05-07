/*Write a program to print all odd length palindrome words present in a sentence.
Input : String = “madam speak malayalam fluently”
Output : madam, malayalam
*/


class day9_1
{
	public static void main(String[] args)
	{
		String str="madam speak malayalam fluently";
		 int start=0;
		 int position=0;
		 
		 
		 
		 while(start<str.length())
		 {
		 	while(start<str.length() && str.charAt(start)!= ' ')
		 	{
		 		start++;
		 		
		 	}
		 	String temp=str.substring(position,start);
		 	if(isPalindrome(temp) && temp.length()%2==1)
		 	{
		 		System.out.println(temp);
		 	}
		 	start=start+1;
		 	position=start;
		 	
		 }
		 
       }
       
       
        // Checking weather the word is palindrome or not
   	 public static boolean isPalindrome(String str){
		int start = 0;
		int end = str.length() - 1;
		while(start < end) {
		    if(str.charAt(start) != str.charAt(end)){
		        return false;
		    }
		    start++;
		    end--;
		 }
		 return true;
    }
       
}
