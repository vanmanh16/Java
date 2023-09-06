package Bai02;

import java.util.Scanner;

public class Person {

    private String name;
    private Integer age;
    private String gender;

    public Person() {
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void Input(String name, Integer age, String gender){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap age:");
        age = sc.nextInt();
        System.out.println("Nhap gender: ");
        gender = sc.nextLine();
    }

    public static void Output(String name, Integer age, String gender){
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Gender: " + gender);
    }
}
