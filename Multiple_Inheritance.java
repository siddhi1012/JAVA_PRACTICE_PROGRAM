interface A {
    void show();
}
interface B{
    void display();
}

class C implements A,B {
    public void show(){
        System.out.println("A Method");
    }
    public void display(){
        System.out.println("B Method");
    }
}


public class Multiple_Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.show();
    }
    
}
