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
class First {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle();
        shape.create();
        // shape.calculate();
        // We performed casting from parent to child 
        // This casting can raise runtime failure because Parent class object reference
        // can not capable to convert to Child Class
        shape = new Shape();
        if(shape instanceof Rectangle)
        {
            System.out.println("Good");
            ((Rectangle)shape).calculate();
        }
        
        shape = new Rectangle();
        if(shape instanceof Rectangle)
        {
            System.out.println("Good 1");
            ((Rectangle)shape).calculate();
        }
    }    
}
