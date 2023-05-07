class main{
public static void main(String[] args){
int num=5;

for(int i=1;i<=num;i++){
    String bag="";
    for(int j=1;j<=num;j++){
        if(i==1||i==num){
         bag=bag+"*"+" "; 
        }
        else if(j==1||j==num){
            bag=bag+"*"+" ";
        }
       
        else{
        bag=bag+"  ";
        }
        }
System.out.println(bag);

}
}
}
