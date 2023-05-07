class main{
	public static void main(String[] args){
		
		int con=0;
		int v=0;
		String word="abcdeabcdefgaaaa";
		for(int i=0;i<word.length();i++){
		char c=word.charAt(i);
		    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			v++;
		     }
		     else{
		     
		     con++;
		     }
		     }
		     
		     System.out.println(v);
		     System.out.println(con);
	}
	}
			
			

