package week4.day3;

import javax.imageio.IIOException;
import java.io.IOException;

public class HelloPrinter {
    Printer2 printer;

    public HelloPrinter(Printer2 printer){
        this.printer = printer;
    }

    public void print(String message) throws IOException {
        System.out.println(message);
    }
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        HelloPrinter hp2 = new HelloPrinter(new FilePrinter());
        //hp.print("hello");
        //hp.repeatMessage(5,"hi");
        hp2.repeatMessage(5,"Hello12");
        //hp2.repeatMessage(5,"Hello");
    }
}
