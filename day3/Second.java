class Second {
    public static void main(String[] args) {
        byte val = 10;
        byte value = (byte)(val * val); // Here type promotion is happening which means byte is converted internally into int by JVM 
        // byte = int * int; or byte = int 
        // bigger to smaller case
        System.out.println(" Val: " + val);
        System.out.println(" Value: " + value);
        char c1 = 'A';
        char c2 = '0';
        char c3 = (char)(c1 + c2); // Here type promotion is happening which means char is promoted into int by JVM
        System.out.println(" C1: " + c1 + " ASCII: " + (int)c1);
        System.out.println(" C2: " + c2 + " ASCII: " + (int)c2);
        System.out.println(" C3: " + c3 + " ASCII: " + (int)c3);
    }    
}
