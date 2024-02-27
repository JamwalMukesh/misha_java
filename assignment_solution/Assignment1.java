/*
You need to design a class name Time

This class contains three member variable
    hours
    minutes
    seconds

You need to design some method which perform given operations
    - A method which is used to set values of these member variable 
    - A method which accept time in seconds as a parameter and convert this time 
    into hours, minutes and seconds and save them in class member variable. 
    - A method which is used to display your class member variable 
    value into seconds. 
    - A display method which print these member variable into time format 
        like hh:mm:ss 

        

Write a main class which demonstrate Time class functionality.
 */
class Time
{
    private int hour, minute, second;
    // A method which is used to set values of these member variable 
    void setTime(int hr, int min, int sec)
    {
        hour = hr;
        minute = min;
        second = sec;
    }
    // A method which accept time in seconds as a parameter and convert this time 
    // into hours, minutes and seconds and save them in class member variable.
    void setTimeUsingSeconds(int seconds)
    {
        hour = seconds / 3600; // Logic to convert seconds into hour
        minute = (seconds % 3600) / 60; // Logic to convert seconds into minute
        second = seconds % 60; // Logic to get remaining seconds
    }
    // A method which is used to display your class member variable 
    // value into seconds.
    void displayInSeconds()
    {
        int seconds = hour * 3600 + minute * 60 + second;
        System.out.println("Time in seconds: " + seconds);
    }
    // A display method which print these member variable into time format 
    // like hh:mm:ss 
    void display()
    {
        String output = "Time: ";
        if(hour<10)
        {
            output += "0";
        }
        output += hour + ":";
        if(minute <10)
        {
            output += "0";
        }
        output += minute + ":";
        if(second<0)
        {
            output += "0";
        }
        output += second;
        System.out.println(output);
    }
}
// Here we have a class named Assignment1 and it contains a main method So this class is called
// Main Class 
class Assignment1 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        t1.setTime(6, 38, 45);
        t2.setTimeUsingSeconds(12345);
        t1.display();
        t1.displayInSeconds();
        t2.display();
    }    
}
