class Array2 {
    public static void main(String[] args) {
        int num[] = new int[5];
        System.out.println("Array Elements");
        for(int value : num)
        {
            System.out.print("[ " + value + "] ");
        }
        System.out.println();
        String strs[] = new String[5];
        System.out.println("Array Elements");
        for(String value : strs)
        {
            System.out.print("[ " + value + "] ");
        }
        System.out.println();
    }
}
