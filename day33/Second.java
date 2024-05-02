// Local Class 
// A class can be defined inside a method and then this class is known as Local Class
// There are two type of Local Class present
// 1. If a class is define inside a non-static method then it is known as Local Inner Class
// 2. If a class is define inside a static method then it is know as Local Static Class
class Demo{
    void show()
    {
        class One 
        {
            void display()
            {
                System.out.println("Good Display Method");
            }
        }
        One ob = new One();
        ob.display();
    }
    static void print()
    {
        class Two 
        {
            void display()
            {
                System.out.println("Local Static class display method");
            }
        }
        Two obj = new Two();
        obj.display();
    }
}
class Second {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        ob1.show();
        ob1.print();
    }    
}
