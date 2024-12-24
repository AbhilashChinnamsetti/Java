import java.util.*;
class stars1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}