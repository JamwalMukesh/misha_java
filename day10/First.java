class Demo
{
    // static show method
    static void show()
    {
        System.out.println("Good Morning");
    }
    // non static display method
    void display()
    {
        System.out.println("Normal good morning");
    }
}
class First
{
    public static void main(String[] args) {
        Demo.show(); // static method call using class name
        Demo obj = new Demo();
        obj.display(); // non static method call using object reference variable

        obj.show(); // We can call static method using object reference variable but not recommended.
    }
}