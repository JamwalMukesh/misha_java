class Car{
    // private constructor restrict its object creation outside of its class.
    private Car()
    {
        System.out.println("Default car constructor invoked");
    }
}
class First {
    public static void main(String[] args) {
        Car ob;
        ob = new Car();
    }
}
