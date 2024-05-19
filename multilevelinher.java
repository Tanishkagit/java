
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
class banana extends apple{
    public void place() { 
System.out.println("place fruits");
}
}

public class muplilevelinher {
    public static void main(String[] args)
    {
        banana ob= new banana();
        ob.eat();
        ob.wash();
        ob.place();
    }
}
