import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Any number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter Any number: ");
            int n2 = sc.nextInt();
            int ans = n1 / n2;
            System.out.println("The Answer: " + ans);
        } catch (InputMismatchException ex) {
            System.out.println("Input mismatch raised");
        } catch (Exception ex) {
            System.out.println("Exception raised");
        }

    }
}
