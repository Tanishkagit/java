class Student{  
 int rollno;  
 String name;  
}  
class fillinfo{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=1;  
  s1.name="Tanishka";  
  System.out.println(s1.id+"   "+s1.name);
 }  
}  

//create more object of class...
class marks{
    int math;
    int science;
    int hindi;
    int english;
}
class markcheck{
    public static void main(String args[]){
        marks m1=new marks();
        marks m2=new marks();
        m1.math=20;
        m1.science=30;
        m1.hindi=50;
        m1.english=60;
        m2.math=90;
        m2.science=49;
        m2.hindi=89;
        m2.english=38;
        System.out.println(m1.math);
        System.out.println(m1.science);
        System.out.println(m1.hindi);
        System.out.println(m1.english);
        System.out.println(m1.math);
        System.out.println(m1.science);
        System.out.println(m1.hindi);
        System.out.println(m1.english);
        
    }
}
