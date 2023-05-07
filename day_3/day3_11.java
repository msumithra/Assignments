class day3_11
{
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,7,9,11};
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minNumber) minNumber = arr[i];
            if(arr[i] > maxNumber) maxNumber = arr[i];
        }
        int[] result = new int[100];
        for(int i = 0; i < arr.length; i++){
            result[arr[i]] += 1;
        }
        for(int i = minNumber; i <= maxNumber; i++)
        {
            result[i] += 1;
        }
        for(int i = 0; i < result.length; i++) {
            if(result[i] == 1){
                System.out.println("missing Number : " + i);
            }
        }
        
    }
}
