interface InterfaceDemo
{
    // abstract method
    public void square();
 
    // default method
    default void show()
    {
      System.out.println("This is a defult method");
    }
}
 
class TestClass implements InterfaceDemo
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
 
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
 
        // default method executed
        d.show();
    }
}
