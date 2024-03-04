class Array1 {
    public static void main(String[] args) {
        int num[] = { 11, 22, 33, 44 , 55 };
        System.out.println("Array Elements");
        for(int value : num)
        {
            System.out.print("[ " + value + "] ");
        }
        System.out.println();
        System.out.println(num[7]);
    }
}
