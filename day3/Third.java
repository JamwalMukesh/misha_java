class Third {
    public static void main(String[] args) {
        int x = 100;
        long y = 100;
        int z = (int)(x + y); // int = int + long here, type promotion second case is active
        // means smaller promote to bigger available in expression
        // In other word, int promoted into long
        // int = long + long 
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
    }    
}
