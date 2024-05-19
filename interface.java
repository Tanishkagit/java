interface animal{
    public void sleep();
    public void eat();
}
class interface implements animal{
    public void sleep(){
        System.out.println("sleeping");
    }
   public void eat(){
        System.out.println("eating");
    }
    public static void main(String args[]){
        interface ob=new interface();
        ob.sleep();
        ob.eat();
    }
}
