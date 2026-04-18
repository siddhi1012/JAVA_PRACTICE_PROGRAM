// class Student {
//     String name;
//     int age;

//     public void getinfo() {
//         System.out.println("The name is " + name + " age is " + age);

//     }
// }

// class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Prasad";
//         s1.age = 22;
//         s1.getinfo();

//     }
// }

// class Demo {

//     void display(Demo obj) {
//         System.out.println("Method called");
//         System.out.println("Object received: " + obj);
//     }

//     void show() {
//         display(this); // passing current object
//     }

//     public static void main(String[] args) {
//         Demo d = new Demo(); // object creation
//         d.show(); // method call
//     }
// }

class Shallow {
    Shallow add() {
        System.out.println("Add");
        return this;
    }

    Shallow sub() {
        System.out.println("Sub");
        return this;
    }
}

public class OOPS {
    public static void main(String[] args) {
        new Shallow().add().sub(); // chaining
    }
}