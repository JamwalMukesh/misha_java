class Shape{
    void create(){
        System.out.println(" Shape is created ");
    }
}
class Rectangle extends Shape{
    void calculate(){
        System.out.println(" Rectangle area is calculated ");
    }
}
class Second {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle();
        shape.create();
        // shape.calculate();
        // We performed casting from parent to child 
        ((Rectangle)shape).calculate();
    }    
}
