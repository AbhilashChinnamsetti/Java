 import java.util.*;
 class xzx{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in) ;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+':
                 System.out.println("RESULT="+(n1+n2));
                 break;
            case '-':
                 System.out.println("RESULT="+(n1-n2));
                 break;
            case '*':
                 System.out.println("RESULT="+(n1*n2));
                 break;
            case '/':
                 System.out.println("RESULT="+(n1/n2));
                 break;
            default:
                System.out.println("invalid input");
        }
    }
 }