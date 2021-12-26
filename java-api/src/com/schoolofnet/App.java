package com.schoolofnet;

import com.schoolofnet.private_code.Private;
import com.schoolofnet.public_code.Public;

import java.io.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

//    public static void main(String[] args) {
//        new Public();
//        new Private();
//    }

//    public static void main(String[] args) {
//        Object obj = new Object();
//        System.out.println(obj.toString());
//        String name = "Marcos";
//        System.out.println(name.toString());
//
//        Class<Public> publicClass = Public.class;
//
//        if (publicClass.isAnnotationPresent(Info.class)) {
//            Annotation annotation = publicClass.getAnnotation(Info.class);
//            Info info = (Info) annotation;
//            System.out.println(info.creteadBy());
//            System.out.println(publicClass);
//        }
//
//    }

//    public static void main(String[] args) throws IOException {
//        File file;
//        FileOutputStream fop;
//        BufferedReader br = null;
//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//
//        try {
//             file = new File("./test.txt");
//
//            if(file.createNewFile()) {
//                System.out.println("File is created");
//            } else {
//                System.out.println("File already exists");
//            }
//            fop = new FileOutputStream(file);
//
//            if(!file.exists()){
//                file.createNewFile();
//            }
//
//            String text = "Hello. My name is marcos";
//            fop.write(text.getBytes());
//            fop.flush();
//            fop.close();
//
//            System.out.println("Done");
//            System.out.println("Preparing to read");
//
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
//            DataInputStream dis = new DataInputStream(bis);
//
//            while(dis.available() != 0) {
//                System.out.println(dis.readLine());
//            }
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }
//
//        try {
//            String currentLine = "";
//
//            br = new BufferedReader(new FileReader("./test.txt"));
//
//
//            while((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//
//            if (br != null) {
//                br.close();
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();;
//        }
//
//    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Headset");
        list.add("Teclado");
        list.add("Cadeira");

        System.out.println(list.toString());

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Leonan");
        map.put(1, "Luiz");
        map.put(2, "Wesley");


        System.out.println(map.toString());
        System.out.println(map.get(0));
    }
}
