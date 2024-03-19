// Normal Class
// One class have another class as a member and this class is known as Outer class
class One {
    int value;
    static int val;
    // non static nested class or Inner Class
    class Two {
        int value; // Outer class instance variable hiding 
        Two(){
            System.out.println(" Two non static nested class is construct " );
            System.out.println(" Value: " + value + " Val: " + val + " Outer value: " + One.this.value);
        }
    }
    // static nested class
    static class Three{
        Three(){
            System.out.println(" Three static nested class is construct ");
            // System.out.println(" Value: " + value + " Val: " + val);
            System.out.println(" Val: " + val);
        }
    }
    void show(){
        Two obj = new Two();
        Three ob = new Three();
    }
    static void display()
    {
        // Two obj = new Two();
        Three ob = new Three();
    }
}

class First {
    public static void main(String[] args) {
        One.Three ot = new One.Three();
        One ob = new One();
        ob.value = 1100;
        One.Two otw = ob.new Two();
    }
}
