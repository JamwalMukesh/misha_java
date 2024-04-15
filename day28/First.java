class A {
    void show(){
        System.out.println(" A method ");
    }
}
class B extends A{
    final void show(){
        System.out.println(" B method ");
    }
}
final class C extends B{
    void show(){
        System.out.println(" C method ");
    }
}
class D extends C{

}
class E extends Math{

}
class First {
    public static void main(String[] args) {
        
    }    
}
