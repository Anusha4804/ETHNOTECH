class EmpMangement {

    String name="Raghu";
    double salary=50000;
    String role="developer";
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
class details extends EmpMangement{
    void method()
    {
        super.info();
        System.out.println("salary:"+super.salary);
    }
    
}
