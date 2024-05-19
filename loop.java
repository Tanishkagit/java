//for loop to find the sum of n natural numbers.
class loop{
    public static void main(String ags[]){
        int sum=0;
        int i;
        for(i=0;i<=1000;i++){
            sum +=i;
        }
        System.out.println("the sum of 0 to 1000 is " +sum);
        }
    }

//for loop to find factorial.
class loop{
    public static void main(String ags[]){
        int i;
        double fact=1;
        for(i=1;i<=50;i++){
            fact *=i;
        }
        System.out.println("the factorial of 50 is "+fact);
    }
}

//while loop..
class loop{
    public static void main(String ags[]){
        int sum=0;
        int i=0;
        while(i<=100){
            sum +=i;
            i++;
        }
        System.out.println("the sum of 0 to 100 is " +sum);
    }
}

//while loop for factorial.
class loop{
    public static void main(String ags[]){
        double fact=1;
        int i=1;
        while(i<=50){
            fact *=i;
            i++;
        }
        System.out.println("the factorial of 50 is " +fact);
    }
}


//do-while loop...
class loop{
    public static void main(String ags[]){
       int sum=0;
       int i=0;
       do{
           sum +=i;
           i++;
           
       }while(i<=1000);
       System.out.println("the sum of 0 to 1000 is " +sum);
    }
}

//do-while loop for factorial.
class loop{
    public static void main(String ags[]){
       int fact=1;
       int i=1;
       do{
           fact *=i;
           i++;
           
       }while(i<=5);
       System.out.println("the factorial of 5  is " +fact);
    }
}


//foreach loop..
import java.io.*;
class loop{
    public static void main(String ags[]){
        int arr[]={1,2,3,4,5};
        for(int value : arr){
            System.out.println("the values of array are : " +value);
        }
    }
    
}
