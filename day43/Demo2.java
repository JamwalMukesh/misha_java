class Car{
     Car(int val){
        System.out.println("Welcome to Class Method");
    }
}
class Demo2 {
    public static void main(String[] args) {
        try{
            Class.forName("Car").newInstance();
        }catch(ClassNotFoundException ex){
            System.out.println(" No class definition ");
        }catch(InstantiationException ex){
            System.out.println(" No class object creation error ");
        }catch(IllegalAccessException ex){
            System.out.println(" Illegal Access Exception ");
        }
        
    }    
}
