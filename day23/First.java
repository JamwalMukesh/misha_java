class One{
    void show()
    {
        System.out.println("Show method of One class");
    }
}
// Two class is a child of One class.
class Two extends One{

}
class First {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.show(); // This show method comes from Two class parent
    }    
}
