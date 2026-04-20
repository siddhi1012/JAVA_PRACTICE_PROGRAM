class Student {
    private int id;

    // setter
    public void setId(int id) {
        this.id = id;
    }

    // getter
    public int getId() {
        return id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(102);
        System.out.println(s.getId());

    }

}
