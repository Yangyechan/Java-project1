package week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2 {
    //BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));

    public FilePrinter() throws IOException {
    }

    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
