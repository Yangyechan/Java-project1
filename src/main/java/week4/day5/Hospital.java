package week4.day5;

public class Hospital {
    private String name; //병원이름
    private String websiteAddress;  //웹사이트이름
    private Address address; //병원주소(객체 Address를 활용)

    public Hospital(String name, String websiteAddress, Address address) {
        this.name = name;
        this.websiteAddress = websiteAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public Address getAddress() {
        return address;
    }
}