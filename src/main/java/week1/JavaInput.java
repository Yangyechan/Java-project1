package week1;

import java.io.InputStreamReader;
import java.io.IOException;
public class JavaInput {
    public void readAchar() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }
    public static void main(String[] args) {

    }
}
