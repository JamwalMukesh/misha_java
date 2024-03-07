// I need to build a class which have a special property
// which is it can be instantiated only once.
// I need a class which have only one object not more than once
// Such thing can be achieved using a Design Pattern known as Singleton Design Pattern
// Design Pattern is a way in Software development for solving a problem
// While designing the Singleton Design Pattern we use the private constructor
class Demo {
    // Here instance is a reference variable of Demo class type
    // instance is also a member variable of Demo class
    // It is private which means it can't accessible outside the Demo class
    // It is static which means it exists in memory when class definition loads
    // In other word, we have single copy of this reference variable and which
    // belongs to class Demo
    private static Demo instance;

    // I build a private constructor which means we can't instantiate Demo class
    // outside its definition
    private Demo() {
        System.out.println(" Demo class object is created. ");
    }

    // Here, public indicate this method can be accessible outside the class
    // static indicates this method can be directly accessible with the help of
    // class name
    // Here, Demo is a return type of this method which convey this method return
    // the object reference of
    // Demo class object
    public static Demo getInstance() {
        if (instance == null) {
            instance = new Demo();
        }
        return instance;
    }
}

class First {
    public static void main(String[] args) {
        Demo o1 = Demo.getInstance();
        Demo o2 = Demo.getInstance();
        Demo o3 = Demo.getInstance();
    }
}
