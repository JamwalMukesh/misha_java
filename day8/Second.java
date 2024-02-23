// In this example I am using the concept of single class to explain the concept
class Second
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
    // Can I design a method which print my given symbol by given times whenever it is called
    // Here we pass another parameter which accept int as value and represent the times of symbol printing
    void displayLine(char symbol, int times)
    {
        for(int i = 1;  i <= times; i++)
        {
            System.out.print(symbol);    
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Second line = new Second();
        line.displayLine('=',50); // call the displayLine() method
        System.out.println(" Hello ");
        line.displayLine('-',60);
        System.out.println(" Misha ");
        line.displayLine('_',30);
        System.out.println(" Sethi ");
        line.displayLine('~',80);
    }
}