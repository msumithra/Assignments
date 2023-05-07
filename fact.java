class main{
	public static void main(String[] args){
		int fact=1;
		int n=10;
		if(n==0||n==1){
		System.out.println(1);
		}
			for(int i=2;i<=n;i++){
				fact=fact*i;
			}
			System.out.println(fact);
	}
	
}
