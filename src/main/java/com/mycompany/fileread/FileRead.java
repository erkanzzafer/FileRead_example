/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fileread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author zafer
 */
public class FileRead {

    public static void main(String[] args) throws IOException {

        File file = new File("kod.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        String val = "Kodlama Vakti!";

        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.write("Java Dersleri");
        bWriter.close();

        FileReader fReader = new FileReader(file);
        String line;

        BufferedReader bReader = new BufferedReader(fReader);
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }

        bReader.close();

    }
}
