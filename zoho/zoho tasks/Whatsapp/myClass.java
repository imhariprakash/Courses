import java.io.*;
 
class myClass{
    public static void main(String[] args){
        try{
            
            File file = new File("folder\\hello.txt");
            if(!file.exists()){ // if file does not exist
                file.mkdirs(); // create the directory
                file.createNewFile();
            }
            // while(file.getFilePointer() != file.length())
            //     System.out.println(file.readLine());
            // file.writeUTF("hello line");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}


/*abstract

        // while(file.getFilePointer() != file.length()){
        //     System.out.println(sc.nextLine());
        // }
        
        // while((str = file.readLine()) != null){
        //     System.out.println(str);
        // }

*/

/*abstract


import java.io.*;
 
class myClass{
    public static void main(String[] args){
        try{
            PrintWriter file = new PrintWriter(new FileWriter("hello.txt", true));
            file.println("Hello World");
            file.close();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}

*/