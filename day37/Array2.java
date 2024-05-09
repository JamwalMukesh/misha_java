/* 
 * You need only practice practice practice (8 Hours per day in Summer)
 * Array is a collection of homogenous data element refer by a common name.
 * How to access these element using this common name.
 * There is concept of index number and in other word every array element has its index.
 * index number begin from zero.
 * If we access an array beyond its index range then it give ArrayIndexOutOfBounds Exception in java
 * Array is a static data structure which means you program must know size of array before working on it.
 * There is list of array operations
 * 1. Traversing which means access all array element one by one
 * 2. Insert an element at given position in an array if array has place to adjust new element
 * 3. Delete an element from a position in an array
 * 4. Search an element and find its index in an array and return -1 if not found
 * 5. Sorting
 * 6. Merging
 */

 import java.util.Scanner;

 class MyArray
 {
     private int array[];
     private int maxsize;
     private int size;
     MyArray(int maxsize, int size)
     {
         array = new int[maxsize];
         this.maxsize = maxsize;
         this.size = size;
         generateRandomValues();
     }
     // To generate random values for an array
     private void generateRandomValues()
     {
         for(int i = 0; i < size; i++)
         {
             array[i] = (int)(Math.random() * 100 + 1); // This code generate random value between 1 to 100
         }
     }
     public void traverse()
     {
         System.out.println("Array elements");
         if( size == 0 )
         {
             System.out.println(" EMPTY ARRAY ");
         }
         else
         {
             for(int i = 0; i < size; i++)
             {
                 System.out.print(" [ " + array[i] + " ]");
             }
             System.out.println();
         }
         System.out.println();
     }

     // Why boolean as return type
     // because we know there is two status of insertion either done or not done
     // So this status can be easily represent by boolean type
     public boolean insert(int position,int item)
     {
        if( (position < 1 && position > size) || size == maxsize )
        {
            return false;
        }
        else
        {
            // misha
            // 2 position add i
            // miisha
            int pos = size - 1; // because array index begin from 0
            // This loop shift every element starting from last position and goes to position where you want to insert new element
            // and shift each element to its next position
            while( pos >= position - 1)
            {
                array[pos+1] = array[pos];
                pos--;
            } 
            array[position-1] = item;
            size++; // Now size of stored element in an array is increased by 1
            return true;
        }
     }
 }
 class Array2
 {
     public static void main(String[] args)
     {
         // I am always create a bigger size array and ask user to set the initial size.
         // I am also generating intial values for an array using random function
         // Due to this, I have less burden to fill the array
         int maxsize, size;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter max size of array: ");
         maxsize = sc.nextInt();
         System.out.print("Enter initial size of array: ");
         size = sc.nextInt();
         if( size > 0 && maxsize > 0 && size < maxsize)
         {
             MyArray arr = new MyArray(maxsize, size);
             arr.traverse();
             arr.insert(2, 11);
             arr.traverse();
         }
         else
         {
             System.out.println("Invalid initial size or maxsize of an array given");
         }
     }
 }