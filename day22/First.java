class Demo {
    void show() {
        int value = 1100;
        // NewClass is a Local Inner Class because defined inside a
        // non-static method
        class NewClass {
            void display() {
                System.out.println("Local Inner Class display method " + value);
                // local variables referenced from an inner class must be final or effectively final
                // In other word, we can say local class cannot manipulate the local variable
                // You can say it is treated as constant variable or final variable
                value += 100;
            }
        }
        NewClass ob = new NewClass();
        ob.display();
    }

    static void display() {
        // If a local class is defined inside a static method
        // then it is known as Locall Static Class
        class MyLocalStaticClass {
            void show() {
                System.out.println("Local Static Class show method");
            }
        }
        MyLocalStaticClass ms = new MyLocalStaticClass();
        ms.show();
    }
}

class First {
    public static void main(String[] args) {
        Demo.display();
        Demo ob = new Demo();
        ob.show();
    }
}
