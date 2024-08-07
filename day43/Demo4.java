import java.util.Scanner;

class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

            int n1, n2, ans;
            System.out.print("Enter any number: ");
            n1 = sc.nextInt();
            System.out.print("Enter any number: ");
            n2 = sc.nextInt();
            ans = n1 / n2;
            System.out.println("Answer: " + ans);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }finally{
            System.out.println("Always execute");
        }
    }
}
