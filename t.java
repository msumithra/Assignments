class main{
public static void main(String[] args){
int num=5;

for(int i=1;i<=num;i++){
    let bag="";
    for(let j=1;j<=num;j++){
        if(i==1){
         bag=bag+"*"+" "; 
        }
        else if(j==3){
            bag=bag+"*"+" ";
        }
        else{
            bag=bag+"  ";
        }
    }

console.log(bag);
}
