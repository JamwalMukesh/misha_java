class Shape {
    void draw() {
        System.out.println("Shape is drawn");
    }
}

class Rectangle extends Shape {
    // override draw method
    void draw() {
        System.out.println("Rectangle is drawn");
    }
}

class Circle extends Shape {
    // override draw method
    void draw() {
        System.out.println("Circle is drawn");
    }
}

class First {

    // We build a method which accept a class reference as a parameter of it
    // A class reference variable is capable to hold the object reference of it as
    // well as its child class object
    static void call(Shape shape) {
        // shape can have any type of its child class object as well as its object
        // So draw() method is decided at runtime which definition is need to be called
        // A method which can perform different operations according to its value
        shape.draw();
    }

    // Here we have a method which have a return type Shape class
    // which means this method return Shape class object reference as well as its
    // child class object reference
    static Shape getShape() {
        // return new Rectangle();
        return new Circle();
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        shape.draw();
        rect.draw();
        cir.draw();
        call(shape);
        call(rect);
        call(cir);

        shape = getShape();
        shape.draw();
    }
}
