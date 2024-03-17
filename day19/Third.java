class Operation{
    public static void show(int i,float f){
        System.out.println("integer: " + i + " float: " + f);
    }
    // I overload static method by changing its parameter order
    public static void show(float i,int f){
        System.out.println("float: " + i + " integer: " + f);
    }
}
class Third {
    public static void main(String[] args) {
        Operation.show(11.34F,11);
        Operation.show(11,3.4F);
        // Ambiguity 
        // If JVM found two compatible overload method to be execute
        // then it give ambiguos error
        Operation.show(11,11);
    }    
}
