class Car{
    int price;
    void display()
    {
        // In below state, internally price statement converted into this.price
        // When c1 object reference call this display method then this reference variable contain reference of c1
        // When c2 object reference call this display method then this reference variable contain reference of c2
        System.out.println("Price of Car: $"  + price + "\t" + this.price );
    }
} 
// A class which contain main method is known as Main Class
class UseCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.price = 10000;
        Car c2 = new Car();
        c2.price = 15000;
        System.out.println("The price of car: $" + c1.price);
        System.out.println("The price of car: $" + c2.price);
        c1.display();
        c2.display();
    }
}
