class Student {
    String name ;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor 
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }

    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {

        Student s1 = new Student("Prasad",23);
        Student s2 = new Student (s1);
        s2.display();
      
        
    }
}