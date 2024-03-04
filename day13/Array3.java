class Array3 {
    // In main, we pass args as a parameter which is of type String[]
    // which indicate an array of String type
    // This array is used to hold Command Line arguments
    // In C and C++, it is written like this
    // int main(int argc, char * argv [])
    public static void main(String[] args) {
        System.out.println("Array Elements");
        for(String value : args)
        {
            System.out.print("[ " + value + "] ");
        }
        System.out.println();
    }
}
