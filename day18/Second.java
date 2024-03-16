class Test{
    void change(int value){
        value = value + 100;
    }
    void update(Data data){
        data.value = data.value + 100;
    }
}
class Data{
    int value;
}
class Second {
    public static void main(String[] args) {
        int value = 1100;
        System.out.println(" The value: " + value);
        Test ob = new Test();
        ob.change(value);
        System.out.println(" The value: " + value);
        Data data = new Data();
        data.value = 1100;
        System.out.println(" The data value: " + data.value);
        ob.update(data);
        System.out.println(" The data value: " + data.value);
        Data temp = data;
        temp.value = temp.value + 100;
        System.out.println(" The data value: " + data.value);
    }
}
