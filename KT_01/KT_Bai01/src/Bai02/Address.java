package Bai02;

import java.util.Scanner;

public class Address {
    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void Input(String city, String district){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap city:");
        this.city = sc.nextLine();
        System.out.println("Nhap district");
        this.district = sc.nextLine();
    }

    public void Output(String city, String district){

        System.out.println("City:" + city);
        System.out.println("District" + district);
    }
}
