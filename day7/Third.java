// In this example I am using the concept of single class to explain the concept
class Third
{
    // Here we define a method with name displayLine inside MyLine class
    // It has default access
    // It has void as return type which means it doesn't return any value to its caller
    // It has no parameter
    // Caller method is a method which invoke a method or call a method.
    void displayLine()
    {
        for(int i = 1;  i <= 50; i++)
        {
            System.out.print("-");    
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Third line = new Third();
        line.displayLine(); // call the displayLine() method
        System.out.println(" Hello ");
        line.displayLine();
        System.out.println(" Misha ");
        line.displayLine();
        System.out.println(" Sethi ");
        line.displayLine();
    }
}