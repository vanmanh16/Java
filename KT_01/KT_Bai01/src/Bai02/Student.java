package Bai02;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(int id, String address, double gpa) {
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void Input(Integer id, String address, double gpa){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap id:");
        this.id = sc.nextInt();
        System.out.println("Nhap address");
        this.address = sc.nextLine();
        System.out.println("Nhap gpa:");
        this.gpa = sc.nextDouble();
    }

    public void Output(String city, String district){
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + gpa);
    }
}
