package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Writer writer = new BufferedWriter(new FileWriter(fileName));
        ArrayList<String> fileCon = new ArrayList<>();
        while (true) {
            try {

                fileCon.add(reader.readLine());
                if (fileCon.contains("exit")) break;




            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i <fileCon.size() ; i++) {


            writer.write(fileCon.get(i));
        }
        writer.close();
    }
}