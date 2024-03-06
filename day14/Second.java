// If a class only have static member 
// then there is no need to construct this class object for accessing its static member
// Because static member can be directly accessed with the help of class name
// So restrict such class object creation we make its constructor with private access
class Calculator{
    private Calculator(){

    }
    public static int sum(int a,int b)
    {
        return a + b;
    }
    public static int difference(int a,int b)
    {
        return a - b;
    }
}
class Second {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(" Sum: " + calc.sum(4,5));
        // System.out.println(" Difference: " + calc.difference(54,23));
        System.out.println(" Sum: " + Calculator.sum(4,5));
        System.out.println(" Difference: " + Calculator.difference(54,23));
        new System();
    }
}
