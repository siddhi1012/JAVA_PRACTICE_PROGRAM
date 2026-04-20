interface Animal{
    
    void walk();

}

class Dog implements Animal{
    public void walk(){
        System.out.println("I walk on 4 lags");
    }
}

class Chicken implements Animal {
    public void walk(){
         System.out.println("I walk on 2 lags");
    }
}


public class Interface {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.walk();
        Animal c = new Chicken();
        c.walk();
    }
    
}
