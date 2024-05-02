// Anonymous (Unknown)
// A class which have no name is known as Anonymous class
class A 
{
    void show()
    {
        System.out.println("Good Morning");
    }
}
class First{
    public static void main(String[] args) {
        A ob = new A(){
            // Here we create a new class which is a child of A class 
            // This class object is created here and this new class is Anonymous
            void show()
            {
                System.out.println("Good Evening");
            }
        };
        ob.show();
    }
}