class One{
    // Inner Class
    class Two{
        void show(){
            System.out.println("Welcome to Two Class");
        }
    }
    // Static Class 
    static class Three{
        void display(){
            System.out.println("Welcome to Three Class");
        }
    }
    // Both nested classes is directly accessible inside the Outer Class
    // Outer Class means class in which Nested classes are defined.
    void call(){
        Two obj = new Two();
        Three ob1 = new Three();
        obj.show();
        ob1.display();
    }
    // static method of Outer class can only access static nested class not inner class
    static void calls(){
        // Two obj = new Two();
        Three ob1 = new Three();
        // obj.show();
        ob1.display();
    }
}
class Second {
    public static void main(String[] args) {
        One ob = new One();
        ob.call();
        One.calls();
        // We can construct object of static nested classes outside its Outer class
        // If its access allowed
        One.Three ot = new One.Three();
        ot.display();
        // We can also construct object of non-static nested class outside its Outer class
        // If its access allowed but it require Outer class object reference.
        One.Two ot2 = ob.new Two();
        ot2.show();
    }    
}
