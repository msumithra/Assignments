/*1.words in a sentence
2.substring in a sentence
3.find even indexes in a words
4.check even index character is a vowel or not*/

class evenIndexVowelInASubstring
{
	public static void main(String[] args)
	{
		String str="joing the bits bootcamp";
		 int start = 0;
       		 int prev = 0;
        	 while(start < str.length())
        	 {
		    	 while(start < str.length() && str.charAt(start) != ' ') 
		    	 {
		         	start++;
		    	 }
		    	 String temp = str.substring(prev,start);
		    	 //System.out.println(temp);
		    	 evenIndex(temp);
		    	
		         start = start+1;
		         prev = start;
       		}
	}
	public static void evenIndex(String str)
	{
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				{
					ans+=str.charAt(i)+" ";
				}
			}
		}
		System.out.println(ans);
	
	}
	
}
