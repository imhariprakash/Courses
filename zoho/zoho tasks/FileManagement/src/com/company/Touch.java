package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class Touch {

    private Touch() {
    } // Prevents instantiation of this class

    public static void touch(ArrayList<String> list) {
        for (String fileName : list) {
            if(fileName.contains("..") && fileName.contains("{") && fileName.contains("}")){
                ArrayList <String> tempList = getList(fileName);
                for(String tempFileName : tempList){
                    validateCreateFile(tempFileName);
                }
            }
            else{
                validateCreateFile(fileName);
            }
        }
    }

    public static void validateCreateFile(String fileName) {
        if(validateFileName(fileName)) {
            FileSystem.createFile(fileName);
        }
    }


    public static ArrayList<String> getList(String string) {
        ArrayList <String> list = null;
        String[] strings = (string.replace("{", " ").replace("}", " ").replace("..", " ")).split(" ");
        if(strings.length == 3) {
            list = new ArrayList<>();
            if(validateFileName(strings[0])){
                for(int i = Integer.parseInt(strings[1]); i <= Integer.parseInt(strings[2]); i++) {
                    list.add((strings[0] + i));
                }
            }
        }
        return list;
    }

    public static String getDateTime(){
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        return(ft.format(dNow).toString());
    }

    public static boolean validateFileName(String fileName) {
        if (fileName == null) {
            return false;
        }
        Pattern p = Pattern.compile("[a-zA-Z0-9.]{1,255}");
        boolean output = p.matcher(fileName).matches();
        if(!output) {
            ErrorHandler.tooLongInput("touch: cannot touch " + fileName + " File name is too long");
        }
        return(output);
    }
}
