class borderElementsInArray {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        String bag="";
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==0||j==0||i==mat.length-1||j==mat.length-1){
                    bag+=mat[i][j]+" ";
                }
            }
        }
        System.out.println("Border eliments:"+bag);
    }
}

/*Write a program to print all border elements present in a 2d array??
Example : Input 1 : [[1 3  4]
                                 [6 3 2]
                                  [9 2 10]]                          
                                        Output1 :  1  6 9 2 10 2 4 3    
*/
