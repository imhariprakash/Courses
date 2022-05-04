import java.io.*;
import java.lang.*;
import java.util.*;
 
final class Base {
 
    void Display()
    {
        System.out.print("Method for Base class.");
    }
}

// can't inherit from final class
 
// class Extended extends Base {  // error
 
//     void Display()
//     {
//         System.out.print("Method of Extended class.");
//     }
// }
 
class FinalClass {
 
    public static void main(String[] arg)
    {
        Extended d = new Extended();
        d.Display();
    }
}