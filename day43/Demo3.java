class A{

}
class B extends A{

}
class Demo3 {
    public static void main(String[] args) {
        // Below Code raised ArrayIndexOutOfBoundsException
        /* 
        int[] num = {11,22,33};
        System.out.println(num[3]);
        */ 
        // Below Code raised NullPointerException
        /*
        String str = null;
        System.out.println(str.length());
         */
        // When we convert a string into integer and that string is not convertible
        // It raised NumberFormatException
        /*
        String str = "ABC";
        int num = Integer.parseInt(str);
         */
        // When parent reference contain parent object reference
        // and your code is casting it into child object 
        // Below code give you ClassCastException
        A obj = new A();
        B ob = (B)obj;
    }    
}
