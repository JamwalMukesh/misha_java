import java.util.Scanner;

class Second {
    public static void main(String[] args) {
        // Here sc is reference variable of Scanner class
        // It hold the object reference of Scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your name: ");
        // nextInt is a public method of Scanner class 
        // and accessible through its reference variable sc with the help of Member access operator
        // Member access operator is represent by dot
        String name = sc.nextLine();
        System.out.println(" Your name: " + name);
    }    
}
