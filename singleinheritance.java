class fruits{
        public void eat(){
        System.out.println("eat");
    }
}

class apple extends fruits {
    public void wash() { 
      System.out.println("firstly wash fruits then eat"); 
    }
}

public class singleinheritance {
    public static void main(String[] args)
    {
        apple ob = new apple();
        ob.eat();
        ob.wash();
    }
