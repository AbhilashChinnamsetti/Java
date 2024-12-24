import java.util.*;
class factorial{
    public static int factorial(int n){
        if(n<=0){
            System.out.println("invalid input");
        }
        int fact=1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
            
           
          
        }
        System.out.println(fact);
         return 1;
         }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);

    }
}