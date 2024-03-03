import java.util.*;
class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int index = 0; index < size; index++){
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
