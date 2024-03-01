class Car
{
    private int price; // price is private 
    // So no one outside the class can manipulate and access this variable
    
    // This is a setter of price variable
    // and capable to assign value to price variable
    // and we can add extra check in this method for assuring correct value of price variable
    public void setPrice(int value)
    {
        if( value <= 0 )
        {
            System.out.println(" Invalid price given so we assign a default price");
            price = 10000;
        }
        else
        {
            price = value;
        }
    }
    public int getPrice()
    {
        return price;
    }
}
class UseCar
{
    public static void main(String[] args) {
        Car ob = new Car();
        ob.setPrice(-100403);
        System.out.println("Price of Car: $" + ob.getPrice());
        Car ob1 = new Car();
        System.out.println("Price of Car: $" + ob1.getPrice());
    }
}