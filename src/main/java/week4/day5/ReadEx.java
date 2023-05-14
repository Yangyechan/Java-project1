package week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEx {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\양예찬\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));
        System.out.println(bufferedReader.readLine());
    }

}
