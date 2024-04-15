class Vehicle{
    int price;
    void start(){
        System.out.println("Vehicle starts...");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car starts...");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts...");
    }
    void display(){
        System.out.println("Display details of Bike");
    }
}
class Second {
    public static void main(String[] args) {
        Vehicle vehicle;
        // Here vehicle is super type of Car sub type
        vehicle = new Car(); // Generalization
        vehicle.start();
        vehicle = new Bike();
        vehicle.start();
        // vehicle.display(); // Not possible
        // For calling display through vehicle reference variable of type Vehicle
        // We need casting
        if(vehicle instanceof Bike){
            ((Bike)vehicle).display();
        }
    }    
}
