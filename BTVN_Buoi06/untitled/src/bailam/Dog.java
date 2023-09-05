package bailam;

import java.util.Scanner;

public class Dog extends Animal {
    private String character;

    public Dog() {
    }

    public Dog(String name, Integer age, float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Preferences: ");
        character = sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Preferences: " + character);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Cho keu: Gaau gaau");
    }
}
