package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (true) {
            try {

                String fileCon = reader.readLine();
                if (fileCon.contains("exit")) break;

                File file = new File(fileName);
                FileWriter fw = new FileWriter(fileCon);
                BufferedWriter writer = new BufferedWriter(fw);
                writer.write(fileCon);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}