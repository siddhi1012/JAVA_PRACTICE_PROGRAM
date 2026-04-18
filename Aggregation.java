class Address{
    String city;
    String state;

    Address(String city, String state){
        this.city = city;
        this.state = state;
    }
}

class Student {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name+" "+address.city+" "+address.state);
    }
}



public class Aggregation {
    public static void main(String[] args) {

        Address add = new Address("pune", "MH");
        Student s = new Student(1,"Siddhi", add);
        s.display();
        
    }
    
}
