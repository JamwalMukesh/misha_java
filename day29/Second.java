class Car{

}
class Second {
    public static void main(String[] args) {
        Car car = new Car();
        // Here println(Object) definition is called
        // Internally it call String.valueOf(Object)
        // String.valueOf method internally call toString() method
        System.out.println(car);  
        System.out.println(car.toString());  
        // System.out.println("hello","world");  
    }    
}
