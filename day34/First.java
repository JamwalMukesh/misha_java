package demo;

public class First {
    public static void main(String[] args)
    {
        System.out.println("Good Morning!!!");
    }
}
// Now our First class belongs to demo package
// package name is written in lowercase.

// -d <directory>               Specify where to place generated class files
// javac -d . First.java
// This command convey byte code of given source code is generate and save inside current directory
// But this -d flag also take care of package creations means directory creation related to that package.

// Remember one thing, To run package class you need to specify the package name with class
// And your running location must be in such place where that package is physically available.