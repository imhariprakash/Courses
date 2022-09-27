import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class FileOutputStreamExercise{
    public static void main(String[] args) throws IOException {
        readThreeTextFilesEnumeration();
    }

    public static void readAllCharactersBuffer(){
        try{
            FileInputStream file = new FileInputStream("sample.txt");
            BufferedInputStream buffer = new BufferedInputStream(file);
            int ascii = buffer.read();
            while(ascii != -1){
                System.out.print((char)ascii);
                ascii = buffer.read();
            }
            buffer.close();
            System.out.println();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readSequenceTextFiles() {
        try{
            FileInputStream file1 = new FileInputStream("sample.txt");
            FileInputStream file2 = new FileInputStream("sample1.txt");
            FileOutputStream file3 = new FileOutputStream("sample2.txt");
            SequenceInputStream sequence = new SequenceInputStream(file1, file2);
            int ascii = sequence.read();
            while(ascii != -1){
                System.out.print((char)ascii);
                file3.write(ascii);
                ascii = sequence.read();
            }
            sequence.close();
            System.out.println();
            file1.close();
            file2.close();
            file3.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void readThreeTextFilesEnumeration(){
        try{
            FileInputStream file1 = new FileInputStream("sample.txt");
            FileInputStream file2 = new FileInputStream("sample1.txt");
            FileInputStream file3 = new FileInputStream("sample2.txt");
            Vector vector = new Vector();
            vector.add(file1);
            vector.add(file2);
            vector.add(file3);

            SequenceInputStream sequence = new SequenceInputStream(vector.elements());
            int ascii = sequence.read();

            while(ascii != -1){
                System.out.print((char)ascii);
                ascii = sequence.read();
            }
            sequence.close();
            System.out.println();
            file1.close();
            file2.close();
            file3.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }catch(IOException e){
            System.out.println("Error");
        }
        
    }

    public static void readThreeTextFiles(){
        try{
            FileInputStream file1 = new FileInputStream("sample.txt");
            FileInputStream file2 = new FileInputStream("sample1.txt");
            FileInputStream file3 = new FileInputStream("sample2.txt");
            FileOutputStream file4 = new FileOutputStream("sample3.txt");
            SequenceInputStream sequence1 = new SequenceInputStream(file1, file2);
            SequenceInputStream sequence2 = new SequenceInputStream(sequence1, file3);
            int ascii = sequence2.read();
            while(ascii != -1){
                System.out.print((char)ascii);
                file4.write(ascii);
                ascii = sequence2.read();
            }
            sequence2.close();
            System.out.println();
            file1.close();
            file2.close();
            file3.close();
            file4.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void WriteToFileBuffer(String text) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("sample.txt");
            BufferedOutputStream buffer = new BufferedOutputStream(file);
            byte[] bytes = text.getBytes();
            buffer.write(bytes);
            buffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void WriteToFile(int ascii){
        try{
            FileOutputStream file = new FileOutputStream("sample.txt");
            file.write(ascii);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void WriteToFile(byte[] text){
        try{
            FileOutputStream file = new FileOutputStream("sample.txt");
            file.write(text);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void readSingleCharacter(){
        try{
            FileInputStream file = new FileInputStream("sample.txt");
            int ascii = file.read();
            System.out.println((char)ascii);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error");
        }
    }

    public static void readAllCharacters(){
        try{
            FileInputStream file = new FileInputStream("sample.txt");
            int ascii = file.read();
            while(ascii != -1){
                System.out.print((char)ascii);
                ascii = file.read();
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error");
        }
        System.out.println();
    }
}