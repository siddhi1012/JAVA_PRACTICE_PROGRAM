// 

class Animal {

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

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("I am Cat");
    }

    void meow() {
        System.out.println("Meowing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
       Animal obj1 = new Dog();
        obj1.eat();
        //obj1.bark();
   


        // for Cat
        Animal obj = new Cat();
        obj.eat();
        //obj.meow();
       
    }

}
