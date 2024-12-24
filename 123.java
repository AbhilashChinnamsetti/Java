import java.util.*;
class a123{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.println("a is equal to b");
        }
        else{
            if(a>b){
                System.out.println("a ig greater");
            }
            else{
                System.out.println("b is greater");
            }
        }

        
    }    
}