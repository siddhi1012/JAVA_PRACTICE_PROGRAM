abstract class Animal {
    abstract void sound();

    Animal() {
        System.out.println("I am Animal");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("I am Dog");
    }

    void sound() {
        System.out.println("Barking");
    }

}

public class Abstract {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();

    }

}
