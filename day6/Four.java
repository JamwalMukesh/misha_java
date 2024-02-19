class Shape
{
    int x; // non-static member variable or instance variable
    static int y; // static member variable or class variable
}
class Four {
    public static void main(String[] args) {
        System.out.println(" Shape static y: " + Shape.y);
        Shape s1 = new Shape();
        s1.x = 100;
        Shape s2 = new Shape();
        s2.x = 200;
        s1.y++;
        s2.y++;
        System.out.println(" s1 x: " + s1.x + " s1 y: " + s1.y);
        System.out.println(" s2 x: " + s2.x + " s2 y: " + s2.y);
        // System.out.println();
        // Here System is a class which is pre-defined in Java API
        // Member Access (Selection) Operator is used with either Object reference or Class name
        // When we use it with class name, it means we are going to access static member
        // So, in other word, out is a static member of System class in Java.
        
    }
}
