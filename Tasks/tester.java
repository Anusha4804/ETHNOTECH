class tester {

    String name="Sheshi";
    double salary=40000;
    String role="Tester";
    void info()
    {
        System.out.println("name of the emp:"+name);
        System.out.println("role of the emp:"+role);
    }
    public static void main(String args[])
    {
        details obj=new details();
        obj.method();  
    }
    
}
class details extends tester{
    void method()
    {
        super.info();
        System.out.println("salary:"+super.salary);
    }
    
}
