class Car {
    private int price;

    Car() {
        price = 10000;
    }

    // setter of private member variable
    public void setPrice(int value) {
        if (value <= 0) {
            price = 1000;
        } else {
            price = value;
        }
    }

    // getter of private member variable
    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("The Price: $" + getPrice());
    }
}

class First {
    public static void main(String[] args) {
        Car obj;
        obj = new Car();
        obj.display();
        Car ob1 = new Car();
        ob1.setPrice(2343);
        ob1.display();
    }
}
