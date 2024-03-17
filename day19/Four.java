class Car{
    private int price;
    Car(){
        System.out.println("Default constructor");
        price = 100000;
    }
    Car(int price){
        // Point to remember:- this call must be first statement inside constructor
        this(); // Here this reference variable is invoke the default constructor
        System.out.println("Parameterized constructor");
        this.price = price;
        
    }
    void display(){
        System.out.println("Price: " + this.price);
    }
}
class Four {
    public static void main(String[] args) {
        Car ob1= new Car();
        Car ob2 = new Car(243435);
        ob1.display();
        ob2.display();
    }
}
