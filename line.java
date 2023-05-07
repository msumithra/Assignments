class main{
    public static void main(String[] args){
        int n=4;
        
        for(int i=1;i<=n;i++){
            String bag="";
            if(i==1||i==n){
            for(int j=1;j<=n;j++){
                    bag=bag+"_ ";
                }
            }
            else{
                for(int j=1;j<=n-1;j++){
                    if(j==1||j==n/2){
                        bag=bag+"|"+"     ";
                    }else{
                        bag+="  ";
                    }
                }
            }
            System.out.println(bag);
        }
    }
}
