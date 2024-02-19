class Car
{
    // access specifier?
    // default access
    // instance variable
    int price;
}
class First
{
    public static void main(String[] args) {
        // c1 is a reference variable of class Car type
        // new Car() create an object of class Car type and return its reference
        // this reference is stored inside c1
        // c1 is a reference variable declare inside a main method
        // So we can say c1 is a local reference variable of class Car type
        Car c1 = new Car();
        // Here . is Member Selection Operator or Member Access Operator
        c1.price = 10000;
        System.out.println(" Price of Car: $" + c1.price);
    }
}