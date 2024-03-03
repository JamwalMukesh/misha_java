// This program is used to generate 10 random number and assign them to an array of integer
// It also display all 10 number of this on to screen
class Four {
    public static void main(String[] args) {
        int num[] = new int[10];
        for(int index = 0; index < 10; index++){
            // I need to generate array element value with some random fashion
            num[index] = (int)(Math.random() * 100 + 1);
        }
        System.out.println("Array Elements");
        for(int index = 0; index < num.length; index++){
            System.out.print("[" + num[index] + "] ");
        }
        System.out.println();
    }    
}
