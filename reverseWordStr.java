class main{
	public static void main(String[] args){
		String para="Java is one of the best programming language. It is mainly used for mobile applications and can use ui designs. It contains lot of featues.";
		int wordc=0;
		int sentence=0;
		for(int i=0;i<para.length();i++)
		{
			if(para.charAt(i) == ' ')
			{
				wordc++;
			}
			//System.out.println(word);
			
			if(para.charAt(i)=='.')
			{
				sentence++;
			}
		}
		
		int characterCount = para.length() - wordc - sentence;
	
		
		System.out.println(characterCount + " " + wordc + " " + sentence);	
		
		
	}
}
