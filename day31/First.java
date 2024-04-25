interface Area{
    void calculateArea();
}
interface Volume{
    void calculateVolume();
}
class Rectangle implements Area{
    public void calculateArea()
    {
        System.out.println("Rectangle Area");
    }
}
class Cube implements Area, Volume{
    public void calculateArea(){
        System.out.println("Cube Area");
    }
    public void calculateVolume(){
        System.out.println("Cube Volume");
    }
}
class First {
    public static void main(String[] args) {
        Area area;
        area = new Rectangle();
        area.calculateArea();
        area = new Cube();
        area.calculateArea();
        Volume vol = new Cube();
        vol.calculateVolume();
    }    
}
