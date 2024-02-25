class Demo
{
    // This display method accept a String as a parameter
    // and display the passed argument value on Screen
    // System.out.println() is used to display the string
    // This method is only available in Console Base Application
    // And Java is capable to build different kind of application
    void display(String message)
    {
        System.out.println("Hello " + message);
    }
    // This getOutput method accept a String as a parameter and also return String
    // It concate passed string argument with Hello and return its value to its caller
    // This function is more usable in different kind of application
    // And in other word, it doesn't use any UI related function of Java
    String getOutput(String message)
    {
        return "Hello " + message;
    }
}
class First
{
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        obj.display("Misha");
        System.out.println(obj.getOutput("Misha"));
    }
}