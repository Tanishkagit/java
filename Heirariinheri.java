
class fruits {
    public void eat()
    {
        System.out.println("eat");
    }
}

class apple extends fruits {
    public void wash() { 
System.out.println("wash then eat");
}
}
class banana extends fruits{
    public void place() { 
System.out.println("place fruits");
}
}

public class Heirariinheri{
    public static void main(String[] args)
    {
        banana ob= new banana();
        ob.eat();
        ob.wash();
        ob.place();
    }
}
