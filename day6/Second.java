class Demo
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String st; // Here String is a class which means it is a reference data type
    boolean ans;
    char c;
}
class Second {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(" Byte value: " + obj.b);
        System.out.println(" Short value: " + obj.s);
        System.out.println(" Int value: " + obj.i);
        System.out.println(" Long value: " + obj.l);
        System.out.println(" Float value: " + obj.f);
        System.out.println(" Double value: " + obj.d);
        System.out.println(" String value: " + obj.st);
        System.out.println(" boolean value: " + obj.ans);
        System.out.println(" characater value: " + obj.c);
    }
}
