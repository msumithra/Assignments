clclass main{
    public static void main(String[] args){
        int[] arr={10,5,1,6,9,7};
        int min=arr[0];
        int secondMax=arr[0];
        int thirdMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMax=min;
                min=arr[i];
            }
            else if(arr[i]<secondMax){
                thirdMax=secondMax;
                secondMax=arr[i];
            }
            else if(arr[i]<thirdMax){
                thirdMax=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(secondMax);
        System.out.println(thirdMax);
        
    }
}
