interface A{
    void show();
}
interface B extends A{
    void display();
}
class AB implements B{
    public void show(){
        System.out.println("Show Method");
    }
    public void display(){
        System.out.println("Display Method");
    }
}
class Second {
    public static void main(String[] args) {
        AB obj = new AB();
        A ref1 = obj;
        B ref2 = obj;
        ref1.show();
        ref2.show();
        ref2.display();
    }    
}
