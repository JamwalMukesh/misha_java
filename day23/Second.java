class A{
    int value;
    A(){
        System.out.println(" A Class Constructor ");
    }
}
class B extends A{
    B(){
        System.out.println(" B Class constructor ");
    }
    void show()
    {
        System.out.println(" The Value: " + value + " Parent Value: " + super.value);
    }
}
class Second {
    public static void main(String[] args) {
        B obj = new B();
        obj.value = 1000;
        System.out.println(" value: " + obj.value);
        obj.show();
    }
}
// A class has a member variable value
// We know a member variable comes in memory when we create an object of its class.
// Here, we construct the object of child class and try to access parent class member variable 
// using child class reference variable
// Is parent member variable is accessible by child class reference variable?
// Yes
// When child class object is created then JVM also construct an object of its associated parent class.
