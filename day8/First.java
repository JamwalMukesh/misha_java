// In this example I am using the concept of single class to explain the concept
class First
{
    // Here we define a method with name displayLine inside MyLine class
    // It has default access
    // It has void as return type which means it doesn't return any value to its caller
    // It has no parameter
    // Caller method is a method which invoke a method or call a method.
    // Can I design a method which print my given symbol 50 times whenever it is called
    // In such case, parameter handling is a best way to manage it.
    // Now this method accept a parameter whose value is decided when we call this function.
    // the value passed in a method is known as argument.
    void displayLine(char symbol)
    {
        for(int i = 1;  i <= 50; i++)
        {
            System.out.print(symbol);    
        }
        System.out.println();
    }
    public static void main(String[] args) {
        First line = new First();
        line.displayLine('='); // call the displayLine() method
        System.out.println(" Hello ");
        line.displayLine('-');
        System.out.println(" Misha ");
        line.displayLine('_');
        System.out.println(" Sethi ");
        line.displayLine('~');
    }
}