package bailam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("Enter profile your cat!");
        cat.Input();
        System.out.println("Enter profile your dog!");
        dog.Input();
        System.out.println("Profile your cat");
        cat.Output();
        cat.tiengKeu();
        System.out.println("Profile your dog");
        dog.Output();
        dog.tiengKeu();
    }
}
