import java.util.*; // For time being, you need to memorise it.
class Third {
    public static void main(String[] args) {
        // Scanner is pre-defined class used to read value from keyboard
        // Here sc is a reference variable and must be a valid identifier.
        Scanner sc = new Scanner(System.in);
        int n1, n2, ans;
        System.out.print(" Enter any number: ");
        n1 = sc.nextInt();
        System.out.print(" Enter any number: ");
        n2 = sc.nextInt();
        ans = n1 + n2;
        System.out.println(" The Sum of given number: " + ans);
    }    
}
