//if..
import java.util.*;
class test{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the value: ");
        int a=ob.nextInt();
        if(a%2==0){
            System.out.println("the number " +a+ " is even number");
        }
    }
}


//if-else...
import java.util.*;
class com{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value : ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("she/he is adult.");
        }
        else{
            System.out.println("she/he is not adult.");
        }
    }
}


//if-else-if..
import java.util.*;
class marks{
    public static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the marks : ");
        int marks=sc.nextInt();
        if(marks<=100 && marks>=80){
            System.out.println("A+ grade");
        }
        else if(marks<=79 && marks>=60 ){
            System.out.println("B+ grade");
        }
        else if(marks<=59 && marks>=30 ){
            System.out.println("C+ grade");
        }
        else{
            System.out.println("fail");
        }
    }
}


//switch..
class search{
    public static void main(String args[]){
        int week=7;
        switch(week){
            case 1 :
                System.out.println("today is monday");
                break;
            case 2 :
                System.out.println("today is tuesday ");
                break;
            case 3 :
                System.out.println("today is wednesday");
                break;
            case 4 :
                System.out.println("today is thursday ");
                break;
            case 5 :
                System.out.println("today is friday");
                break;
            case 6 :
                System.out.println("today is saturday");
                break;
            case 7 :
                System.out.println("today is sunday");
                break;
            default :
                System.out.println("wrong choice");
                break;
        }
    }
}

