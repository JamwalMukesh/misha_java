class Info
{
    static int value;
    int x;
    // non static method
    void setX(int val)
    {
        x  = val;
    }
    // non static method 
    // can access non static member as well as static member of its class
    void increment()
    {
        value++; // static value accessed and incremented
        x++; // non static x accessed and incremented
    }
    // non static method
    void display()
    {
        System.out.println(" non static x: " + x + " static value: " + value);
    }
    // static method
    static void print()
    {
        // it can access static member of its class directly
        System.out.println(" static value: " + value);
        // System.out.println(" non static x: " + x);
        // above code give this error if we uncomment it
        // non-static variable x cannot be referenced from a static context
    }
}
class Second {
    public static void main(String[] args) {
        System.out.println(" Initially static value: " + Info.value);
        Info.print();
        Info obj1 = new Info();
        Info obj2 = new Info();
        obj1.setX(10);
        obj2.setX(10);
        obj1.increment();
        obj1.increment();
        obj2.increment();
        obj1.display();
        obj2.display();
        Info.print();
    }
}
// Mostly we run our program using java command and pass class name which contain the static main method
// java Second
// Here, Second class contain static main method
// JVM want to access this main method as an entry point of program
// and it must be accessible directly.
// In Java, to access a method directly using its class name we have concept of static method
// So, this is the reason we need to declare main as a static method.


