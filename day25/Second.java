class Mammal{
    protected void breath(){
        System.out.println("Mammal is breathing...");
    }
}
// private < default < protected < public
class Dog extends Mammal{
    protected void breath(){
        System.out.println("Dog is breathing...");
    }

}
class Rat extends Mammal{
    public void breath(){
        System.out.println("Rat is breathing...");
    }
}
class Second {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Rat rat = new Rat();
        dog.breath();
        rat.breath();    
    }    
}
