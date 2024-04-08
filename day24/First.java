// This concept in C++ known as Base Class Initialization
class A{
    // Point to consider
    // 1. If developer define an explicit constructor to a class then JVM stop providing default constructor
    // 2. Constructor has parameter.
    // 3. There is no default constructor 
    // 4. Default constructor is a constructor which have no parameter
    A(int value){
        System.out.println("Parameterized constructor of A class " + value);
    }
}
class B extends A {
    B()
    {
        // super(); // This statement indicate calling of parent default constructor
        // With the help of we can invoke parent class constructor inside the child class constructor
        // It must be first statement of the constructor
        super(1010);
    }
}
class First {
    public static void main(String[] args) {
        // When a child class object is created then JVM also create its associated parent class object
        // And we can refer parent class object inside child class with the help of super keyword.
        // super keyword is exists in non-static method of a class
        // Another use of super keyword is to invoke parent class constructor
        B obj = new B();    
        A ref; // Here ref is parent class object reference variable
        ref = new A(434); // parent class object reference variable can hold the object reference its class
        ref = new B(); // It can also hold the object reference of its child class object

    }    
}
