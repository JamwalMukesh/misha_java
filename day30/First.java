abstract class Vehicle{
    // Quick refresher for C++, In C++ pure virtual function is just like abstract method in Java
    abstract void start(); // abstract method does not have body
    // abstract method must be override by child of abstract class which nature is concrete
    void show(){
        System.out.println("Vehicle show method");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is started...");
    }
}
// Non abstract class is called Concrete class 
class First{
    public static void main(String[] args) {
        // We can not instantiate abstract class
        // Vehicle obj = new Vehicle();
        Vehicle obj;
        obj = new Car();
        obj.start();
        obj.show();
    }
}