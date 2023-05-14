package week4.day5;

public class Address {

    private String fullAddress; //전체주소
    private String sido; //시도
    private String sigungu; //시군구

    public Address(String fullAddress, String sido, String sigungu) {
        this.fullAddress = fullAddress;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
