interface Area{
    void calculateArea(); // it is read as public abstract void calculateArea();
}
class Rectangle implements Area{
    public void calculateArea()
    {
        System.out.println("Rectangle Area");
    }
}
class Second {
    public static void main(String[] args) {
        // new Area(); We cannot instantiate interface object
        Area area;
        area = new Rectangle();
        area.calculateArea();
    }    
}
