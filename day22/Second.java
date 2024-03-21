class Car {
    // Below code is known as static block or static initializer
    static {
        System.out.println(" Static Block is initialized");
    }

    // Initializer Block
    // This block execute before constructor invocation
    {
        System.out.println("Initializer block");
    }

    Car() {
        System.out.println("Car constructor");
    }
}

class Second {
    static{
        System.out.println("Main class static block");
    }
    public static void main(String[] args) {
        new Car();
    }
}
