package bailam;

import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String preferences;
    private String ownerName;

    public Cat() {
    }

    public Cat(String name, Integer age, float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Color: ");
        color = sc.nextLine();
        System.out.print("Preferences: ");
        preferences = sc.nextLine();
        System.out.print("Owner Name: ");
        ownerName = sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Color: " + color);
        System.out.println("Preferences: " + preferences);
        System.out.println("OwnerName: " + ownerName);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo keu: Meo Meo");
    }
}
