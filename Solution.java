package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Writer writer = null;
        while (true) {
            try {

                String fileCon = reader.readLine();
                if (fileCon.contains("exit")) break;
                writer = new BufferedWriter(new FileWriter(fileName));


                writer.write(fileCon);
                //writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}