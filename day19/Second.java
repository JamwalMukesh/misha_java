class Calculator{
    public int sum(int n1,int n2){
        return n1 + n2;
    }
    // I overload the sum method by changing its data type
    public double sum(double n1,double n2){
        return n1 + n2;
    }
    // I overload the sum method by changing its number of parameter
    public int sum(int n1,int n2, int n3){
        return n1 + n2 + n3;
    }
}
class Second {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum: " + cal.sum(54,65));
        System.out.println("Sum: " + cal.sum(54.43,65.65));
        System.out.println("Sum: " + cal.sum(54,65,11));
        // JVM firstly search exact overload method for the calling
        // if found then call it
        // otherwise search compatible overload method
        System.out.println("Sum: " + cal.sum(5.4F,6.5F));
    }    
}
