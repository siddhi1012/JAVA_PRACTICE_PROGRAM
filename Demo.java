

// Deep Copy 
class Address {
    String city;

    Address(String city) {
        this.city = city;

    }
}

class Student {
    int id;
    Address address;

    Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Deep Copy
    Student(Student s2) {
        this.id = s2.id;
        this.address = new Address(s2.address.city);
    }
}

public class Demo {
    public static void main(String[] args) {
        Address add = new Address("Pune");
        Student s1 = new Student(1, add);

        Student s2 = new Student(s1);
        s2.address.city = "Mumbai";

        System.out.println(s1.address.city); // Mumbai
        System.out.println(s2.address.city); // Mumbai

    }
}