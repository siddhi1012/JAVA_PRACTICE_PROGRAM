class Animal {

    Animal() {
        System.out.println("I am Animal");
    }

    void sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("I am Dog");
    }

    void sound() {
        //super.sound();
        System.out.println("Barking");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();

    }
}
