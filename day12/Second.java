class Bike {
    private int price;

    // Here we have a parameter with name price
    // parameter is a local variable of a method
    // Now the situtation is local variable has same name of class member variable
    // So inside Bike() parameterized constructor there is concept of instance
    // variable hiding
    Bike(int price) {
        // inside this constructor, if you specify price then it is pick local variable not the 
        // instance variable due to same name
        // Here this refer current associated object reference 
        // With the help of this reference variable we can access instance variable 
        // if there is instance variable hiding happening
        this.price = price;
    }

    public void display() {
        System.out.println("The Price: $" + price);
    }
}

class Second {
    public static void main(String[] args) {
        Bike obj;
        obj = new Bike(5938);
        obj.display();
        // Bike class has one constructor defined by developer which is a parameterized constructor
        // If developer specify any constructor then JVM stop providing its default constructor
        // Below statement is using default constructor in the time of object creation 
        // So, in our code there is no definition of default constructor and we got compile time error.
        new Bike();
    }
}
