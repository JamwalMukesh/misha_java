import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Person Age: ");
                int age = sc.nextInt();
                System.out.println("The Age: " + age);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Please enter valid number in age");
                sc.nextLine();
            }
        }

    }
}
