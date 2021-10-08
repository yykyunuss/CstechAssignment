package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    /**
     * Reads the input file and fills the string array with this input
     */
    public static void readFile(String[] strArray, String fileName) throws IOException {
        Scanner scanner;
        scanner = new Scanner(new File(fileName));
        int index = 0;
        while (scanner.hasNext()) {
            strArray[index++] = scanner.next();
        }
        scanner.close();
    }

    /**
     * Writes the white and black points to the output file
     */
    public static void writeResults(String fileName, double whitePoint, double blackPoint) throws IOException {
        BufferedWriter bufferedWriter;
        bufferedWriter = new BufferedWriter(new FileWriter("sonuclar.txt", true));
        bufferedWriter.write(fileName + "\t\t\t\t" + "Siyah: " + blackPoint + " " + "Beyaz: " + whitePoint + "\n");
        bufferedWriter.close();
    }

    public static void writeHeader() throws IOException {
        BufferedWriter bufferedWriter;
        bufferedWriter = new BufferedWriter(new FileWriter("sonuclar.txt", true));
        bufferedWriter.write("Tahta Dosya Adi\t\t\tSonuclar\n");
        bufferedWriter.close();
    }
}
