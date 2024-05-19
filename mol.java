class mol{
    void add(int a){
        System.out.println("the value of a is : " +a);
    }
    void add(int x, int y){
        System.out.println("the value of x is : " +x);
        System.out.println("the value of y is : " +y);
    }
    void add(int p, float q){
        System.out.println("the value of p is : " +p);
        System.out.println("the value of q is : " +q);
    }
    void add(String z){ System.out.println("the name of z is : " +z);
    }
    public static void main(String args[]){
        mol ob=new mol();
        ob.add(10);
        ob.add(10,7);
        ob.add(10,3.5f);
        ob.add("Tanishka");
        
    }
    
}
