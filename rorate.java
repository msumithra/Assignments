class main{
	public static void main(String[] args){
	int a[][]={{1,2},
	          {3,4}};
	          System.out.print("{");
	          for(int i=0;i<a.length;i++){
	          	String rotate="";
	          	for(int j=a.length-1;j>=0;j--){
	          	 rotate+=a[j][i]+" ";
	          	 
	          	}
	          	
	          	System.out.println(rotate);
	          	
	          }
	          
	}
	}
	
