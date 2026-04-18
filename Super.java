class Animal {
    String color = "White";

    Animal() {
        System.out.println("I am Animal");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        System.out.println("I am Dog");
    }

    void bark() {
        super.eat();
        System.out.println("Barking");
    }

    void printColor() {
        System.out.println(super.color);
        System.out.println(color);
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.printColor();

    }

}
