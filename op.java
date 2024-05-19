//scanner use to take input from the user.
import java.util.*;
class op{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a :");
        int a=sc.nextInt();
        System.out.println("enter value of b: ");
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("the value of c(a+b) =  "+c);  
    }
}
