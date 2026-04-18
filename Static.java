//static variable
// class Student {
//     int id;
//     static String college = "Indira College";

//     Student(int id) {
//         this.id = id;

//     }

//     void display() {
//         System.out.println(id + " " + college);
//     }
// }

// public class Static {
//     public static void main(String[] args) {
//         Student s = new Student(1);
//         s.display();

//     }
// }

//static method
// class Static {
//     static int x = 10;
//     static void show() {
//         System.out.println("Static method called");
//         System.out.println(x);
//     }

//     public static void main(String[] args) {
//         show(); // no object needed
//     }
// }

//static block
// class Static {
//     static int x;
//     static {
//         x = 10;
//         System.out.println("Static block executed");
//     }

//     public static void main(String[] args) {
//         System.out.println("Main method");
//     }
// }

//static nested class

class Outer {
    static class inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

class Static {
    public static void main(String[] args) {
        Outer.inner obj = new Outer.inner();
        obj.display();
    }
}
