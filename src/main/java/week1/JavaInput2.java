package week1;

import java.io.IOException;
import java.io.InputStreamReader;
public class JavaInput2 {
    public void readTwoChars() throws IOException {InputStreamReader is = new InputStreamReader(System.in);
// 한 글자 읽어서 코드 출력
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();
        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }

}
