class main{
	public static void main(String[] args){
		String sentence="The car is moving on the road";
		String bag="";
			for(int i=0;i<sentence.length();i++)
			{
			if(i==sentence.length()-1){
			
				bag=sentence.charAt()+bag;
			}
			}
			System.out.println(bag);
	}
}
