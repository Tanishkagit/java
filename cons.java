class cons{
    cons(){
        System.out.println("hello world");
        System.out.println("hello java");
        System.out.println("hello exams!!");
    }
    cons(int a , int b){
        int c;
        c=a+b;
        System.out.println("the addition of a+b is : " +c);
    }
    public static void main(String args[]){
        cons ob=new cons();
        cons ob1=new cons(1,5);
    }
}
