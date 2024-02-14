class First
{
    public static void main(String[] args) {
        byte val = 'A';
        System.out.println(" Val: " + val);
        // val = false;
        // 45.56 default is double
        // Now double goes inside float
        // In other word, bigger compatible goes inside smaller compatible one
        // Then, there is an issue
        // float value = 45.56;
        // System.out.println(" Value: " + value);
        //There are two solutions of above code.
        // First solution (pick float value and assign to float variable)
        float value = 45.56F;
        System.out.println(" Value: " + value);
        value = (float)45.56; // using explicit casting and there may be some loss of data
        System.out.println(" Value: " + value);
    }
}