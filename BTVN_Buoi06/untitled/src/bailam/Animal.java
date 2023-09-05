package bailam;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected Integer age;
    protected float weight;

    public Animal() {
    }

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age=sc.nextInt();
        System.out.print("Nhap can nang: ");
        weight=sc.nextFloat();
    }
    public void Output(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age );
        System.out.println("Can nang: " + weight + "kg");
    }
    public void tiengKeu(){
        System.out.println("Tieng keu: Chua xac dinh!");
    }
}
