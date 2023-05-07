class main{
	public static void main(String[] args){
		int[][] arr={{1 ,3,  4},

                                 {6 ,3, 2},

                                  {9, 2, 10}};
                                  borderEle(arr);
	}
	public static int borderEle(int[][] arr){
		for(int i = 0 ;i <arr.length ; i++ )
		{
			for(int j = 0 ;j <arr.length ; j++ )
		        {
			//System.out.println(arr[i][j]);
			if(i ==0){
			System.out.println(arr[j][i]);
			}
			if(i == arr.length-1){
				System.out.println(arr[i][j]);
			}
			if(j==0){
				System.out.println(arr[i][j]);
			}
		}
		}
		return 1;
	}

}
