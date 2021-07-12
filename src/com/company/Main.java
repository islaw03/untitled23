package com.company;

import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("Text.txt");

        FileReader fild = new FileReader("C:\\Users\\User\\IdeaProjects\\untitled21\\src\\com\\company\\Main.java");
        Scanner sc = new Scanner(fild);
//        StringBuilder str = new StringBuilder();
        String str = "";
        String str2 = "";
        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
//            final StringBuilder append;
//            append = str.append(sc.nextLine());
            str = str + sc.nextLine() + "\n";
            str2 = str.replace(" ", "");
        }
        fw.write(str2);
        fild.close();
        fw.close();
        File file = new File("Text.txt");
        System.out.println(file.length() + " Байт");
        try{
            if(file.length() > 100){
                throw new IllegalStateException();

            }}catch (IllegalStateException e){
            System.out.println(" большой размер файла");
        }
    }


}

