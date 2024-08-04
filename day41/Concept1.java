import java.util.*;
class InvalidDiscountException extends RuntimeException
{
    InvalidDiscountException(String message)
    {
        // I am invoking its parent class constructor by passing message
        super(message); // ??
    }
}
// In our mind, Bill class is build by a  developer name Mukesh
class Bill{
    // If this method is used by any developer 
    // and someone add negative discount then what will be happen?
    // So Mukesh as developer want to convey Misha about such scenario
    // One thing is we can use if else to handle negative case inside 
    // this method
    // By placing if statement, Mukesh is able to handle negative case
    // but not able to convey it to Misha
    // He must provide else case to convey message
    // We are using sout for convey message.
    // Is this approach is good or bad?
    // Java is not made for console based application and our sout is only
    // available for console based application.
    // We need a solution where it is not depend upon UI layer of code
    // We need a solution where Misha developer has control to handle this situation
    // not Mukesh developer.
    // In other word, Mukesh developer has power to convey message to Misha developer
    // But Misha has full power to control that situation.
    // Java provide Exception Handling for above problem solution.
    public double calculatedDiscountedPrice(double price,double discount){
        double newprice = price;
        if(discount > 0 ){
            double discountAmount = newprice / 100 * discount;
            newprice = newprice - discountAmount;
        }else{
            throw new InvalidDiscountException("Invalid discount given. Negative is not valid discount value");
        }
        return newprice;
    }
}
// In our mind, Concept1 is build by a developer name Misha
class Concept1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, discount;
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        System.out.print("Enter discount: ");
        discount = sc.nextDouble();
        try{
            Bill bill = new Bill();
            double newprice = bill.calculatedDiscountedPrice(price, discount);
            System.out.println("After discount, price: " + newprice);
        }catch(InvalidDiscountException ex){
            System.out.println("Something bad happens");
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}