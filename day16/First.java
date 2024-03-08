class Demo{
    Demo(){
        System.out.println("Demo Object is created.");
    }
    protected void finalize(){
        System.out.println("Finalized method is called");
    }
}
class First {
    public static void main(String[] args) {
        Demo obj;
        // When we use new keyword then Demo class object gets memory
        // In other, Java environment dynamically allocate memory to Demo class object
        // If memory is allocated dynamically then how it is deallocated in java environment
        // In C++, delete keyword is used to deallocate memory which is allocated using new keyword
        // In Java, there is a special operation which is responsible for memory deallocation
        // This process name is called Garbage Collection which is deallocate memory of unused object reference
        // Unused object reference means an object whose reference is not hold by any variable
        // In java, Garbage collection is invoked by JVM and it is not controlled by developer.
        obj = new Demo(); 
        obj = null; // It means the object reference of Demo class available at line 17 goes into unused state

        // In Java, there is a built in method available in System class
        // which is responsible for generating a request to call the Garbage Collection
        System.gc();
    }
}
