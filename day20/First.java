class First {

    public static int sum(int n1,int n2){
        return n1 + n2;
    }
    public static int sum(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    // I need a sum definition which is capable to accept any number of arguments
    // Then var args concept originate
    public static int sum(int ... args)
    {
        // args is a var args
        // Internally it is an array which hold all value passed as an argument
        int result = 0;
        for(int value : args)
        {
            result += value;
        }
        return result;
    }
    public static double sum( double ... args)
    {
        double result = 0;
        for(double value : args)
        {
            result += value;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum: " + sum(11,22));
        System.out.println("Sum: " + sum(11,22,44));
        System.out.println("Sum: " + sum(11,22,44,55,66));
        System.out.println("Sum: " + sum(11,22,44,11,32,45,35,67));
        System.out.println("Sum: " + sum(3.43,32.23,5.34));
    }    
}
