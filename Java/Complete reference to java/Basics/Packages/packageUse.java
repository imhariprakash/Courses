package Packages;

public class packageUse{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}


// note : now this class can't be ran  independently -> must be run in association with a package


/* 


java packageUse

Error: Could not find or load main class packageUse
Caused by: java.lang.ClassNotFoundException: packageUse

java Packages.packageUse           ---> cd "c:\Users\S HARIPRAKASH\Desktop\"      -> top level

Hello world

cd "c:\Users\S HARIPRAKASH\Desktop\Packages\" ; if ($?) { javac packageUse.java } ; if ($?) { java packageUse }
Error: Could not find or load main class packageUse
Caused by: java.lang.NoClassDefFoundError: Packages/packageUse (wrong name: packageUse)


*/