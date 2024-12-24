import java.util.*;
class sum1{
    public static void sumofodd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum=sum+i;
                
            }
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumofodd(n);


    }
}