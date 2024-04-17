class Employee extends Object{
    public String toString()
    {
        return "Employee Class Object";
    }
}
class Bank
{
    Employee[] emp;
}
class First {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.toString());
        Object obj = emp;

        obj = new Bank();
    }    
}
