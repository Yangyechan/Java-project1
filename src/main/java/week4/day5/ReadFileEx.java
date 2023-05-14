package week4.day5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    //파일 내용 읽어오기
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines){
            hospitals.add(parse(line));

        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));//UTF-8인코딩 방식으로 객체 생성
        List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");//getLines()의 반환 값(파일 내용 ->String 리스트)을 strLines에 저장
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);//getHospitals()를 이용해서 파일내용(strLines)을 Hospital list인 parsedHospital에 저장
        for (int i = 0; i < parsedHospital.size(); i++) {//parsedHospital에 잘 저장되었는지 확인해봅니다.
            Hospital hospital = parsedHospital.get(i); //parsedHospital에 저장된 처음부터 끝인덱스까지 순회합니다.
            System.out.printf("%s %s %s\n", hospital.getName(),hospital.getWebsiteAddress(), hospital.getAddress().getFullAddress());//저장된 hopital을 getter을 이용해서 병원이름, 웹사이트주소, full주소를 출력합니다.
        }
    }

}
