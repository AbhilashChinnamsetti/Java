import java.util.*;
class average{
    public static int avg (int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);

        return avg;
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        avg(a,b,c);


    } 
}
